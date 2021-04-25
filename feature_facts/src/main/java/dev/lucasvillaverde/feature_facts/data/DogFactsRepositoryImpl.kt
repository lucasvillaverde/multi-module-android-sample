package dev.lucasvillaverde.feature_facts.data

import dev.lucasvillaverde.feature_facts.data.network.model.toModel
import dev.lucasvillaverde.feature_facts.data.network.service.DogFactService
import dev.lucasvillaverde.feature_facts.domain.model.DogFact
import dev.lucasvillaverde.feature_facts.domain.repository.DogFactRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class DogFactsRepositoryImpl(private val dogFactService: DogFactService) : DogFactRepository {
    override fun getDogFacts(): Flow<List<DogFact>> = flow {
        val response = dogFactService.getFacts()
        if (!response.isSuccessful)
            throw Exception(response.message())

        response.body()?.let { dogFactsResponse ->
            emit(dogFactsResponse.map { it.toModel() })
        }
    }.flowOn(Dispatchers.IO)
}