/*
 * Copyright 2017 Jasmine Villadarez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jasvilladarez.kotelegram.model

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