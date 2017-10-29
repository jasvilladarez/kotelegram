package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#keyboardbutton
 */
data class KeyboardButton(
        @SerializedName("text")
        val text: String,
        @SerializedName("request_contact")
        val requestContact: Boolean? = null,
        @SerializedName("request_location")
        val requestLocation: Boolean? = null
)