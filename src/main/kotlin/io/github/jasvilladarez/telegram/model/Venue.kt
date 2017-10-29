package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#venue
 */
data class Venue(
        @SerializedName("location")
        val location: Location,
        @SerializedName("title")
        val title: String,
        @SerializedName("address")
        val address: String,
        @SerializedName("foursquare_id")
        val foursquareId: String? = null
)