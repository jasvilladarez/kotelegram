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
 * @see https://core.telegram.org/bots/api#shippingaddress
 */
data class ShippingAddress(
        @SerializedName("country_code")
        val countryCode: String,
        @SerializedName("state")
        val state: String,
        @SerializedName("city")
        val city: String,
        @SerializedName("street_line1")
        val streetLine1: String,
        @SerializedName("street_line2")
        val streetLine2: String,
        @SerializedName("post_code")
        val postCode: String
)