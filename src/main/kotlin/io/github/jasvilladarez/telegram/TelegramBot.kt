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

package io.github.jasvilladarez.telegram

import io.github.jasvilladarez.telegram.api.TelegramService
import io.github.jasvilladarez.telegram.listener.UpdateListener
import io.github.jasvilladarez.telegram.request.SendMessageRequest
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
            }
        }
    }

    fun addListener(updateListener: UpdateListener) {
        updateListeners.add(updateListener)
    }

    fun sendMessage(sendMessageRequest: SendMessageRequest) {
        telegramService.sendMessage(sendMessageRequest).execute()
    }
}