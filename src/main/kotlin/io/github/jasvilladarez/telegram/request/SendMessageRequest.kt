package io.github.jasvilladarez.telegram.request

import com.google.gson.annotations.SerializedName
import io.github.jasvilladarez.telegram.model.ParseMode
import io.github.jasvilladarez.telegram.model.markup.Markup

/**
 * @see https://core.telegram.org/bots/api#sendmessage
 */
data class SendMessageRequest(
        @SerializedName("chat_id")
        val chatId: String,
        @SerializedName("text")
        val text: String,
        @SerializedName("parse_mode")
        val parseMode: ParseMode? = null,
        @SerializedName("disable_web_page_preview")
        val disableWebPagePreview: Boolean? = null,
        @SerializedName("disable_notification")
        val disableNotification: Boolean? = null,
        @SerializedName("reply_to_message_id")
        val replyToMessageId: Int? = null,
        @SerializedName("reply_markup")
        val replyMarkup: Markup
)