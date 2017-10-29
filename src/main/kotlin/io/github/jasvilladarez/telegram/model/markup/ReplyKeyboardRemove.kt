package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#replykeyboardremove
 */
data class ReplyKeyboardRemove(
        @SerializedName("selective")
        val selective: Boolean? = null
) : Markup {

    @SerializedName("remove_keyboard")
    val removeKeyboard: Boolean = true
}