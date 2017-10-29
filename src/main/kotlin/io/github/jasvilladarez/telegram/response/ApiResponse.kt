package io.github.jasvilladarez.telegram.response

import com.google.gson.annotations.SerializedName
import io.github.jasvilladarez.telegram.model.ResponseParameters

internal abstract class ApiResponse<out T>(
        @SerializedName("ok")
        val ok: Boolean,
        @SerializedName("error_code")
        val errorCode: Int? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("parameters")
        val parameters: ResponseParameters? = null,
        @SerializedName("result")
        val result: T
)