/*
 * Copyright 2017 Jasmine Villadarez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jasvilladarez.kotelegram

import io.github.jasvilladarez.kotelegram.api.TelegramService
import io.github.jasvilladarez.kotelegram.listener.UpdateListener
import io.github.jasvilladarez.kotelegram.model.Update
import io.github.jasvilladarez.kotelegram.request.SendMessageRequest
import java.io.IOException
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
            getUpdates()?.forEach {
                try {
                    callOnMessageReceivedListener(it)
                } catch (e: Exception) {
                    callOnError(e)
                }
                currentMaxId = it.updateId + 1
            }
        }
    }

    private fun getUpdates(): List<Update>? {
        val response = try {
            telegramService.getUpdates(currentMaxId, timeout = timeout).execute()
        } catch (e: SocketTimeoutException) {
            callOnError(e)
            return null
        }

        if (!response.isSuccessful) {
            callOnError(IOException(response.errorBody()?.string()))
            return null
        }
        return response.body()?.result
    }

    private fun callOnMessageReceivedListener(update: Update) {
        updateListeners.forEach { listener ->
            update.message?.let { listener.onMessageReceived(it) }
        }
    }

    private fun callOnError(error: Throwable) {
        updateListeners.forEach {
            it.onError(error)
        }
    }

    fun addListener(updateListener: UpdateListener) {
        updateListeners.add(updateListener)
    }

    fun sendMessage(sendMessageRequest: SendMessageRequest) {
        telegramService.sendMessage(sendMessageRequest).execute()
    }
}