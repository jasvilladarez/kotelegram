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

package io.github.jasvilladarez.kotelegram.api

import io.github.jasvilladarez.kotelegram.model.Message
import io.github.jasvilladarez.kotelegram.model.ParseMode
import io.github.jasvilladarez.kotelegram.model.Update
import io.github.jasvilladarez.kotelegram.model.User
import io.github.jasvilladarez.kotelegram.model.markup.InlineKeyboardMarkup
import io.github.jasvilladarez.kotelegram.request.SendMessageRequest
import io.github.jasvilladarez.kotelegram.response.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

internal interface TelegramApi {

    @GET("getMe")
    fun getMe(): Call<Response<User>>

    @GET("getUpdates")
    fun getUpdates(@Query("offset") offset: Int? = null,
                   @Query("limit") limit: Int? = null,
                   @Query("timeout") timeout: Int? = null,
                   @Query("allowed_updates") allowedUpdates: MutableList<Update.Type>? = null): Call<Response<List<Update>>>

    @POST("sendMessage")
    fun sendMessage(@Body sendMessageRequest: SendMessageRequest): Call<Response<Message>>

    @POST("forwardMessage")
    @FormUrlEncoded
    fun forwardMessage(@Field("chat_id") chatId: String,
                       @Field("from_chat_id") fromChatId: String,
                       @Field("message_id") messageId: Int,
                       @Field("disable_notification") disableNotification: Boolean? = null): Call<Response<Message>>

    @POST("deleteMessage")
    @FormUrlEncoded
    fun deleteMessage(@Field("chat_id") chatId: String,
                      @Field("message_id") messageId: Int): Call<Response<Boolean>>

    @POST("editMessageText")
    @FormUrlEncoded
    fun editMessageText(@Field("text") text: String,
                        @Field("chat_id") chatId: String,
                        @Field("message_id") messageId: Int,
                        @Field("parse_mode") parseMode: ParseMode? = null,
                        @Field("disable_web_page_preview") disableWebPagePreview: Boolean? = null,
                        @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null): Call<Response<Message>>

    @POST("editMessageText")
    @FormUrlEncoded
    fun editMessageText(@Field("text") text: String,
                        @Field("inline_message_id") inlineMessageId: String,
                        @Field("parse_mode") parseMode: ParseMode? = null,
                        @Field("disable_web_page_preview") disableWebPagePreview: Boolean? = null,
                        @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null): Call<Response<Message>>

    @POST("editMessageCaption")
    @FormUrlEncoded
    fun editMessageCaption(@Field("chat_id") chatId: String,
                           @Field("message_id") messageId: Int,
                           @Field("caption") caption: String? = null,
                           @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null): Call<Response<Message>>

    @POST("editMessageCaption")
    @FormUrlEncoded
    fun editMessageCaption(@Field("inline_message_id") inlineMessageId: String,
                           @Field("caption") caption: String? = null,
                           @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null): Call<Response<Message>>

    @POST("editMessageReplyMarkup")
    @FormUrlEncoded
    fun editMessageReplyMarkup(@Field("chat_id") chatId: String,
                               @Field("message_id") messageId: Int,
                               @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null): Call<Response<Message>>

    @POST("editMessageReplyMarkup")
    @FormUrlEncoded
    fun editMessageReplyMarkup(@Field("inline_message_id") inlineMessageId: String,
                               @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null): Call<Response<Message>>

    @POST("pinChatMessage")
    @FormUrlEncoded
    fun pinChatMessage(@Field("chat_id") chatId: String,
                       @Field("message_id") messageId: Int,
                       @Field("disable_notification") disableNotification: Boolean? = null): Call<Response<Boolean>>

    @POST("unpinChatMessage")
    fun unpinChatMessage(@Field("chat_id") chatId: String): Call<Response<Boolean>>
}