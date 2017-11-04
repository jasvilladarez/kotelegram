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

package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#message
 */
data class Message(
        @SerializedName("message_id")
        val id: Int,
        @SerializedName("date")
        val date: Long,
        @SerializedName("chat")
        val chat: Chat,
        @SerializedName("from")
        val from: User? = null,
        @SerializedName("forwarded_from")
        val forwardedFrom: User? = null,
        @SerializedName("forwarded_from_message_id")
        val forwardedFromMessageId: Int? = null,
        @SerializedName("forward_signature")
        val forwardSignature: String? = null,
        @SerializedName("reply_to_message")
        val replyToMessage: Message? = null,
        @SerializedName("edit_date")
        val editDate: Long? = null,
        @SerializedName("author_signature")
        val authorSignature: String? = null,
        @SerializedName("text")
        val text: String? = null,
        @SerializedName("entities")
        val entities: List<MessageEntity>? = null,
        @SerializedName("caption_entities")
        val captionEntities: List<MessageEntity>? = null,
        @SerializedName("audio")
        val audio: Audio? = null,
        @SerializedName("document")
        val document: Document? = null,
        @SerializedName("game")
        val game: Game? = null,
        @SerializedName("photo")
        val photo: List<PhotoSize>? = null,
        @SerializedName("sticker")
        val sticker: Sticker? = null,
        @SerializedName("video")
        val video: Video? = null,
        @SerializedName("voice")
        val voice: Voice? = null,
        @SerializedName("video_note")
        val videoNote: VideoNote? = null,
        @SerializedName("caption")
        val caption: String? = null,
        @SerializedName("contact")
        val contact: Contact? = null,
        @SerializedName("location")
        val location: Location? = null,
        @SerializedName("venue")
        val venue: Venue? = null,
        @SerializedName("new_chat_members")
        val newChatMembers: List<User>? = null,
        @SerializedName("left_chat_member")
        val leftChatMember: User? = null,
        @SerializedName("new_chat_title")
        val newChatTitle: String? = null,
        @SerializedName("new_chat_photo")
        val newChatPhoto: List<PhotoSize>? = null,
        @SerializedName("delete_chat_photo")
        val deleteChatPhoto: Boolean? = null,
        @SerializedName("group_chat_created")
        val groupChatCreated: Boolean? = null,
        @SerializedName("supergroup_chat_created")
        val superGroupChatCreated: Boolean? = null,
        @SerializedName("channel_chat_created")
        val channelChatCreated: Boolean? = null,
        @SerializedName("migrate_to_chat_id")
        val migrateToChatId: Int? = null,
        @SerializedName("migrate_from_chat_id")
        val migrateFromChatId: Int? = null,
        @SerializedName("pinned_message")
        val pinnedMessage: Message? = null,
        @SerializedName("invoice")
        val invoice: Invoice? = null,
        @SerializedName("successful_payment")
        val successfulPayment: SuccessfulPayment? = null
)