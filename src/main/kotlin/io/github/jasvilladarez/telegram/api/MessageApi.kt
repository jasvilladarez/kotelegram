package io.github.jasvilladarez.telegram.api

import io.github.jasvilladarez.telegram.model.ParseMode
import io.github.jasvilladarez.telegram.model.markup.InlineKeyboardMarkup
import io.github.jasvilladarez.telegram.request.SendMessageRequest
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

internal interface MessageApi {

    @POST("sendMessage")
    @FormUrlEncoded
    fun sendMessage(@Body sendMessageRequest: SendMessageRequest)

    @POST("forwardMessage")
    @FormUrlEncoded
    fun forwardMessage(@Field("chat_id") chatId: String,
                       @Field("from_chat_id") fromChatId: String,
                       @Field("message_id") messageId: Int,
                       @Field("disable_notification") disableNotification: Boolean? = null)

    @POST("deleteMessage")
    @FormUrlEncoded
    fun deleteMessage(@Field("chat_id") chatId: String,
                      @Field("message_id") messageId: Int)

    @POST("editMessageText")
    @FormUrlEncoded
    fun editMessageText(@Field("text") text: String,
                        @Field("chat_id") chatId: String,
                        @Field("message_id") messageId: Int,
                        @Field("parse_mode") parseMode: ParseMode? = null,
                        @Field("disable_web_page_preview") disableWebPagePreview: Boolean? = null,
                        @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null)

    @POST("editMessageText")
    @FormUrlEncoded
    fun editMessageText(@Field("text") text: String,
                        @Field("inline_message_id") inlineMessageId: String,
                        @Field("parse_mode") parseMode: ParseMode? = null,
                        @Field("disable_web_page_preview") disableWebPagePreview: Boolean? = null,
                        @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null)

    @POST("editMessageCaption")
    @FormUrlEncoded
    fun editMessageCaption(@Field("chat_id") chatId: String,
                           @Field("message_id") messageId: Int,
                           @Field("caption") caption: String? = null,
                           @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null)

    @POST("editMessageCaption")
    @FormUrlEncoded
    fun editMessageCaption(@Field("inline_message_id") inlineMessageId: String,
                           @Field("caption") caption: String? = null,
                           @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null)

    @POST("editMessageReplyMarkup")
    @FormUrlEncoded
    fun editMessageReplyMarkup(@Field("chat_id") chatId: String,
                               @Field("message_id") messageId: Int,
                               @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null)

    @POST("editMessageReplyMarkup")
    @FormUrlEncoded
    fun editMessageReplyMarkup(@Field("inline_message_id") inlineMessageId: String,
                               @Field("reply_markup") replyMarkup: InlineKeyboardMarkup? = null)

    @POST("pinChatMessage")
    @FormUrlEncoded
    fun pinChatMessage(@Field("chat_id") chatId: String,
                       @Field("message_id") messageId: Int,
                       @Field("disable_notification") disableNotification: Boolean? = null)

    @POST("unpinChatMessage")
    fun unpinChatMessage(@Field("chat_id") chatId: String)
}