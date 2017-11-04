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

package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#replykeyboardmarkup
 */
data class ReplyKeyboardMarkup(
        @SerializedName("keyboard")
        val keyboard: List<List<KeyboardButton>>,
        @SerializedName("resize_keyboard")
        val resizeKeyboard: Boolean? = null,
        @SerializedName("one_time_keyboard")
        val oneTimeKeyboard: Boolean? = null,
        @SerializedName("selective")
        val selective: Boolean? = null
) : Markup
