package io.github.jasvilladarez.telegram.api

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