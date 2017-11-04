package io.github.jasvilladarez.telegram

import io.github.jasvilladarez.telegram.api.TelegramService
import io.github.jasvilladarez.telegram.listener.UpdateListener
import java.net.SocketTimeoutException

class TelegramBot(
        private val botToken: String,
        private val timeout: Int = 30
) {

    private var currentMaxId = 0

    private val updateListeners = mutableListOf<UpdateListener>()

    private val telegramService by lazy {
        TelegramService(botToken).telegramApi
    }

    fun startPolling() {
        while (true) {
            val getUpdates = if (currentMaxId > 0) {
                telegramService.getUpdates(currentMaxId, timeout = timeout)
            } else {
                telegramService.getUpdates(timeout = timeout)
            }

            val response = try {
                getUpdates.execute()
            } catch (e: SocketTimeoutException) {
                continue
            }

            if (!response.isSuccessful) continue
            val responseBody = response.body() ?: continue
            val updates = responseBody.result
            updates.forEach { update ->
                updateListeners.forEach { listener ->
                    update.message?.let { listener.onMessageReceived(it) }
                }
                currentMaxId = update.updateId + 1
                System.out.println(currentMaxId)
            }
        }
    }

    fun addListener(updateListener: UpdateListener) {
        updateListeners.add(updateListener)
    }
}