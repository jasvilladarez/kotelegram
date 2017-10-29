package io.github.jasvilladarez.telegram.model

import com.google.gson.annotations.SerializedName

/**
 * @see https://core.telegram.org/bots/api#maskposition
 */
data class MaskPosition(
        @SerializedName("point")
        val point: Point,
        @SerializedName("x_shift")
        val xShift: Float,
        @SerializedName("y_shift")
        val yShift: Float,
        @SerializedName("scale")
        val scale: Float
) {
    enum class Point {
        FOREHEAD,
        EYES,
        MOUTH,
        CHIN
    }
}