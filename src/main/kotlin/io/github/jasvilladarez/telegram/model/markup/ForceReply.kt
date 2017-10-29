package io.github.jasvilladarez.telegram.model.markup

import com.google.gson.annotations.SerializedName

/**
 * https://core.telegram.org/bots/api#forcereply
 */
data class ForceReply(
        @SerializedName("selective")
        val selective: Boolean? = null
) : Markup {

    @SerializedName("force_reply")
    val forceReply: Boolean = true
}