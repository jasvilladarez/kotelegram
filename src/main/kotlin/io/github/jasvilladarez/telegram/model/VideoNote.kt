package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#videonote
 */
data class VideoNote(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("length")
        val length: Int,
        @SerializedName("duration")
        val duration: Int,
        @SerializedName("thumb")
        val thumb: PhotoSize? = null,
        @SerializedName("file_size")
        val fileSize: Int? = null
)