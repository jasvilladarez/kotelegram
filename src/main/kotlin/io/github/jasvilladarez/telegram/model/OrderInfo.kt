package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#orderinfo
 */
data class OrderInfo(
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("phone_number")
        val phoneNumber: String? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("shipping_address")
        val shippingAddress: ShippingAddress? = null
)