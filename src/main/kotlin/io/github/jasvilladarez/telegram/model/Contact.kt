package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#contact
 */
data class Contact(
        @SerializedName("phone_number")
        val phoneNumber: String,
        @SerializedName("first_name")
        val firstName: String,
        @SerializedName("last_name")
        val lastName: String?,
        @SerializedName("user_id")
        val userId: Int? = null
)