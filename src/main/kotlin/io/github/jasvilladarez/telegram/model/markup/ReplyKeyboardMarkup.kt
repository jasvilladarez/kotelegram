package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#replykeyboardmarkup
 */
data class ReplyKeyboardMarkup(
        @SerializedName("keyboard")
        val keyboard: List<List<KeyboardButton>>,
        @SerializedName("resize_keyboard")
        val resizeKeyboard: Boolean? = null,
        @SerializedName("one_time_keyboard")
        val oneTimeKeyboard: Boolean? = null,
        @SerializedName("selective")
        val selective: Boolean? = null
) : Markup
