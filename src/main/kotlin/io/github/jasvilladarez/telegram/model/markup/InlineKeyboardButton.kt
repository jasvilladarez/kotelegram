package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName
import io.github.jasvilladarez.telegram.model.CallbackGame

/**
 * @see https://core.telegram.org/bots/api#inlinekeyboardbutton
 */
data class InlineKeyboardButton(
        @SerializedName("text")
        val text: String,
        @SerializedName("url")
        val url: String? = null,
        @SerializedName("callback_data")
        val callbackData: String? = null,
        @SerializedName("switch_inline_query")
        val switchInlineQuery: String? = null,
        @SerializedName("switch_inline_query_current_chat")
        val switchInlineQueryCurrentChat: String? = null,
        @SerializedName("callback_game")
        val callbackGame: CallbackGame? = null,
        @SerializedName("pay")
        val pay: Boolean? = null
)