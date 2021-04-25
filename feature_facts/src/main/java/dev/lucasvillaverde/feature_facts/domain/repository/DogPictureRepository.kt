package dev.lucasvillaverde.feature_facts.domain.repository

import dev.lucasvillaverde.feature_facts.domain.model.DogFact
import dev.lucasvillaverde.feature_facts.domain.model.DogPicture
import kotlinx.coroutines.flow.Flow

interface DogPictureRepository {
    fun getDogPicture(): Flow<DogPicture>
}