package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#sticker
 */
data class Sticker(
        @SerializedName("file_id")
        val fileId: String,
        @SerializedName("width")
        val width: Int,
        @SerializedName("height")
        val height: Int,
        @SerializedName("thumb")
        val thumb: PhotoSize? = null,
        @SerializedName("emoji")
        val emoji: String? = null,
        @SerializedName("set_name")
        val setName: String? = null,
        @SerializedName("mask_position")
        val maskPosition: MaskPosition? = null,
        @SerializedName("file_size")
        val fileSize: Int? = null
)