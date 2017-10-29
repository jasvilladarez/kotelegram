package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#file
 */
data class File(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("file_size")
        val fileSize: Int? = null,
        @SerializedName("file_path")
        val filePath: String? = null
)