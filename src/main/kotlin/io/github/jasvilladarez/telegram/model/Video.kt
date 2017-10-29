package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#video
 */
data class Video(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("width")
        val width: Int,
        @SerializedName("height")
        val height: Int,
        @SerializedName("duration")
        val duration: Int,
        @SerializedName("thumb")
        val thumb: PhotoSize? = null,
        @SerializedName("mime_type")
        val mimeType: String? = null,
        @SerializedName("file_size")
        val fileSize: Int? = null
)