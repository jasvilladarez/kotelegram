package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#messageentity
 */
data class MessageEntity(
        @SerializedName("type")
        val type: Type,
        @SerializedName("offset")
        val offset: Int,
        @SerializedName("length")
        val length: Int,
        @SerializedName("url")
        val url: String? = null,
        @SerializedName("user")
        val user: User? = null
) {
    enum class Type {
        MENTION,
        HASHTAG,
        BOT_COMMAND,
        URL,
        EMAIL,
        BOLD,
        ITALIC,
        CODE,
        PRE,
        TEXT_LINK,
        TEXT_MENTION
    }
}