package dev.lucasvillaverde.feature_facts.data

import dev.lucasvillaverde.feature_facts.data.network.model.toModel
import dev.lucasvillaverde.feature_facts.data.network.service.DogPictureService
import dev.lucasvillaverde.feature_facts.domain.model.DogPicture
import dev.lucasvillaverde.feature_facts.domain.repository.DogPictureRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class DogPictureRepositoryImpl(private val dogPictureService: DogPictureService) : DogPictureRepository {
    override fun getDogPicture(): Flow<DogPicture> = flow {
        val response = dogPictureService.getRandomDogPictureUrl()
        if (!response.isSuccessful)
            throw Exception(response.message())

        response.body()?.let { dogPictureResponse ->
            emit(dogPictureResponse.toModel())
        }
    }.flowOn(Dispatchers.IO)
}