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

package io.github.jasvilladarez.kotelegram.model.markup

import com.google.gson.annotations.SerializedName
import io.github.jasvilladarez.kotelegram.model.CallbackGame

/**
 * @see https://core.telegram.org/bots/api#inlinekeyboardbutton
 */
data class InlineKeyboardButton(
        @SerializedName("text")
        val text: String,
        @SerializedName("url")
        val url: String? = null,
        @SerializedName("callback_data")
        val callbackData: String? = null,
        @SerializedName("switch_inline_query")
        val switchInlineQuery: String? = null,
        @SerializedName("switch_inline_query_current_chat")
        val switchInlineQueryCurrentChat: String? = null,
        @SerializedName("callback_game")
        val callbackGame: CallbackGame? = null,
        @SerializedName("pay")
        val pay: Boolean? = null
)