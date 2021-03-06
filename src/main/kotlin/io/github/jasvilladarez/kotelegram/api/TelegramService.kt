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

package io.github.jasvilladarez.kotelegram.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class TelegramService(
        private val botToken: String
) {
    companion object {
        private const val TELEGRAM_BASE_URL = "https://api.telegram.org/bot"
    }

    val telegramApi: TelegramApi by lazy {
        Retrofit.Builder().baseUrl("$TELEGRAM_BASE_URL$botToken/")
                .addConverterFactory(GsonConverterFactory.create(GSON))
                .build()
                .create(TelegramApi::class.java)
    }
}