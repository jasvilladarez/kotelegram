package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#userprofilephotos
 */
data class UserProfilePhotos(
        @SerializedName("total_count")
        val totalCount: Int,
        @SerializedName("photos")
        val photos: List<List<PhotoSize>>
)