package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#callbackquery
 */
data class CallbackQuery(
        @SerializedName("id")
        val id: String,
        @SerializedName("from")
        val user: User,
        @SerializedName("chat_instance")
        val chatInstance: String,
        @SerializedName("message")
        val message: Message? = null,
        @SerializedName("inline_message_id")
        val inlineMessageId: String? = null,
        @SerializedName("data")
        val data: String? = null,
        @SerializedName("game_short_name")
        val gameShortName: String? = null
)