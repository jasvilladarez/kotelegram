package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#successfulpayment
 */
data class SuccessfulPayment(
        @SerializedName("currency")
        val currency: String,
        /**
         * Total price in the smallest units of the currency (integer, not float/double).
         * For example, for a price of US$ 1.45 pass amount = 145.
         * See the exp parameter in currencies.json, it shows the number of digits past the decimal point
         * for each currency (2 for the majority of currencies).
         */
        @SerializedName("total_amount")
        val totalAmount: Int,
        @SerializedName("invoice_payload")
        val invoicePayload: String,
        @SerializedName("telegram_payment_charge_id")
        val telegramPaymentChargeId: String,
        @SerializedName("provider_payment_charge_id")
        val providerPaymentChargeId: String,
        @SerializedName("shipping_option_id")
        val shippingOptionId: String? = null,
        @SerializedName("order_info")
        val orderInfo: OrderInfo? = null
)