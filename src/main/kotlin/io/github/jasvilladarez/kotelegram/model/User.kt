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
 * @see https://core.telegram.org/bots/api#user
 */
data class User(
        @SerializedName("id")
        val id: Int,
        @SerializedName("is_bot")
        val isBot: Boolean,
        @SerializedName("first_name")
        val firstName: String,
        @SerializedName("last_name")
        val lastName: String? = null,
        @SerializedName("username")
        val username: String? = null,
        @SerializedName("language_code")
        val languageCode: String? = null
)