package dev.lucasvillaverde.feature_facts.data.network.service

import dev.lucasvillaverde.feature_facts.data.network.model.DogPictureResponse
import retrofit2.Response
import retrofit2.http.GET

interface DogPictureService {
    @GET("random")
    suspend fun getRandomDogPictureUrl(): Response<DogPictureResponse>
}