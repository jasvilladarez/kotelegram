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

package io.github.jasvilladarez.kotelegram.request

import com.google.gson.annotations.SerializedName
import io.github.jasvilladarez.kotelegram.model.ParseMode
import io.github.jasvilladarez.kotelegram.model.markup.Markup

/**
 * @see https://core.telegram.org/bots/api#sendmessage
 */
data class SendMessageRequest(
        @SerializedName("chat_id")
        val chatId: String,
        @SerializedName("text")
        val text: String,
        @SerializedName("parse_mode")
        var parseMode: ParseMode? = null,
        @SerializedName("disable_web_page_preview")
        var disableWebPagePreview: Boolean? = null,
        @SerializedName("disable_notification")
        var disableNotification: Boolean? = null,
        @SerializedName("reply_to_message_id")
        var replyToMessageId: Int? = null,
        @SerializedName("reply_markup")
        var replyMarkup: Markup? = null
)