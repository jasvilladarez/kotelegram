package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#audio
 */
data class Audio(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("duration")
        val duration: Int,
        @SerializedName("performer")
        val performer: String? = null,
        @SerializedName("title")
        val title: String? = null,
        @SerializedName("mime_type")
        val mimeType: String? = null,
        @SerializedName("file_size")
        val fileSize: Int? = null
)