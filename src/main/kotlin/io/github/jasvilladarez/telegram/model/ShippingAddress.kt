package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#shippingaddress
 */
data class ShippingAddress(
        @SerializedName("country_code")
        val countryCode: String,
        @SerializedName("state")
        val state: String,
        @SerializedName("city")
        val city: String,
        @SerializedName("street_line1")
        val streetLine1: String,
        @SerializedName("street_line2")
        val streetLine2: String,
        @SerializedName("post_code")
        val postCode: String
)