package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#chat
 */
data class Chat(
        @SerializedName("id")
        val id: Int,
        @SerializedName("type")
        val type: Chat.Type,
        @SerializedName("title")
        val title: String? = null,
        @SerializedName("username")
        val username: String? = null,
        @SerializedName("first_name")
        val firstName: String? = null,
        @SerializedName("last_name")
        val lastName: String? = null,
        @SerializedName("all_members_are_administrators")
        val isAllMembersAdmin: Boolean = false,
        @SerializedName("photo")
        val chatPhoto: ChatPhoto? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("invite_link")
        val inviteLink: String? = null,
        @SerializedName("pinned_message")
        val pinnedMessage: Message? = null,
        @SerializedName("sticker_set_name")
        val stickerSetName: String? = null,
        @SerializedName("can_set_sticker_set")
        val canSetStickerSet: Boolean = false
) {
    enum class Type {
        PRIVATE,
        GROUP,
        SUPERGROUP,
        CHANNEL
    }
}