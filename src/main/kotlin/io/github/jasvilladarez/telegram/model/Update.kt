package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

internal data class Update(
        @SerializedName("update_id")
        val updateId: Int,
        @SerializedName("message")
        val message: Message? = null
) {
    enum class Type {
        MESSAGE
    }
}