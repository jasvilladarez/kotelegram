package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#inlinekeyboardmarkup
 */
data class InlineKeyboardMarkup(
        @SerializedName("inline_keyboard")
        val inlineKeyboard: List<List<InlineKeyboardButton>>
) : Markup