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
 * @see https://core.telegram.org/bots/api#chatmember
 */
data class ChatMember(
        @SerializedName("user")
        val user: User,
        @SerializedName("status")
        val status: Status,
        @SerializedName("until_date")
        val untilDate: Int? = null,
        @SerializedName("can_be_edited")
        val canBeEdited: Boolean? = null,
        @SerializedName("can_change_info")
        val canChangeInfo: Boolean? = null,
        @SerializedName("can_post_messages")
        val canPostMessages: Boolean? = null,
        @SerializedName("can_edit_messages")
        val canEditMessages: Boolean? = null,
        @SerializedName("can_delete_messages")
        val canDeleteMessages: Boolean? = null,
        @SerializedName("can_invite_users")
        val canInviteUsers: Boolean? = null,
        @SerializedName("can_restrict_members")
        val canRestrictMembers: Boolean? = null,
        @SerializedName("can_pin_messages")
        val canPinMessages: Boolean? = null,
        @SerializedName("can_promote_members")
        val canPromoteMembers: Boolean? = null,
        @SerializedName("can_send_messages")
        val canSendMessages: Boolean? = null,
        @SerializedName("can_send_media_messages")
        val canSendMediaMessages: Boolean? = null,
        @SerializedName("can_send_other_messages")
        val canSendOtherMessages: Boolean? = null,
        @SerializedName("can_add_web_page_previews")
        val canAddWebPagePreviews: Boolean? = null
) {
    enum class Status {
        CREATOR,
        ADMINISTRATOR,
        MEMBER,
        RESTRICTED,
        LEFT,
        KICKED
    }
}
