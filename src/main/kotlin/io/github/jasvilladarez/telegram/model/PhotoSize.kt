package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#photosize
 */
data class PhotoSize(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("width")
        val width: Int,
        @SerializedName("height")
        val height: Int,
        @SerializedName("file_size")
        val fileSize: Int? = null
)