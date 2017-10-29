package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#user
 */
data class User(
        @SerializedName("id")
        val id: Int,
        @SerializedName("is_bot")
        val isBot: Boolean,
        @SerializedName("first_name")
        val firstName: String,
        @SerializedName("last_name")
        val lastName: String? = null,
        @SerializedName("username")
        val username: String? = null,
        @SerializedName("language_code")
        val languageCode: String? = null
)