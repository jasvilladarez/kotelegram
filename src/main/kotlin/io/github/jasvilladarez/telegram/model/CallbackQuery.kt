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
 * @see https://core.telegram.org/bots/api#callbackquery
 */
data class CallbackQuery(
        @SerializedName("id")
        val id: String,
        @SerializedName("from")
        val user: User,
        @SerializedName("chat_instance")
        val chatInstance: String,
        @SerializedName("message")
        val message: Message? = null,
        @SerializedName("inline_message_id")
        val inlineMessageId: String? = null,
        @SerializedName("data")
        val data: String? = null,
        @SerializedName("game_short_name")
        val gameShortName: String? = null
)