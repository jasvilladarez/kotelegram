package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#document
 */
data class Document(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("thumb")
        val thumb: PhotoSize? = null,
        @SerializedName("file_name")
        val fileName: String? = null,
        @SerializedName("mime_type")
        val mimeType: String? = null,
        @SerializedName("file_size")
        val fileSize: Int? = null
)