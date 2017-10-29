package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#chatphoto
 */
data class ChatPhoto(
        @SerializedName("small_file_id")
        val smallFileId: String,
        @SerializedName("big_file_id")
        val bigFileId: String
)