package dev.lucasvillaverde.feature_facts.data.network.service

import dev.lucasvillaverde.feature_facts.data.network.model.DogFactResponse
import retrofit2.Response
import retrofit2.http.GET

interface DogFactService {
    @GET("all")
    suspend fun getFacts(): Response<List<DogFactResponse>>
}