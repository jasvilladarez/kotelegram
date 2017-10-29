package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#location
 */
data class Location(
        @SerializedName("longitude")
        val longitude: Double,
        @SerializedName("latitude")
        val latitude: Double
)