package dev.lucasvillaverde.feature_facts.data.network.model

import dev.lucasvillaverde.feature_facts.domain.model.DogPicture

fun DogPictureResponse.toModel() = DogPicture(pictureUrl)
fun DogPicture.toResponse() = DogFactResponse(pictureUrl)