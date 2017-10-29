package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#game
 */
data class Game(
        @SerializedName("title")
        val title: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("photo")
        val photo: List<PhotoSize>,
        @SerializedName("text")
        val text: String? = null,
        @SerializedName("text_entities")
        val textEntities: List<MessageEntity>? = null,
        @SerializedName("animation")
        val animation: Animation? = null
)