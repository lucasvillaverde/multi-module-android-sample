package dev.lucasvillaverde.feature_facts.domain.repository

import dev.lucasvillaverde.feature_facts.domain.model.DogFact
import kotlinx.coroutines.flow.Flow

interface DogFactRepository {
    fun getDogFacts(): Flow<List<DogFact>>
}