package dev.lucasvillaverde.feature_facts.data.network.model

import com.google.gson.annotations.SerializedName

data class DogPictureResponse(
    @SerializedName("message")
    val pictureUrl: String
)
