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

import io.github.jasvilladarez.kotelegram.listener.UpdateListener
import io.github.jasvilladarez.kotelegram.model.Message
import io.github.jasvilladarez.kotelegram.model.MessageEntity

inline fun telegramBot(botToken: String, init: TelegramBot.() -> Unit) =
        TelegramBot(botToken).apply(init)

inline fun TelegramBot.command(command: String, crossinline commandListener: TelegramBot.(Message) -> Unit) =
        addListener(object : UpdateListener {
            override fun onMessageReceived(message: Message) {
                val botCommand = message.entities?.firstOrNull { it.type == MessageEntity.Type.BOT_COMMAND }
                val text = message.text?.split("@")?.first()
                if (botCommand != null && text == command) {
                    commandListener.invoke(this@command, message)
                }
            }
        })