package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#responseparameters
 */
data class ResponseParameters(
        @SerializedName("migrate_to_chat_id")
        val migrateToChatId: Int? = null,
        @SerializedName("retry_after")
        val replyAfter: Int? = null
)