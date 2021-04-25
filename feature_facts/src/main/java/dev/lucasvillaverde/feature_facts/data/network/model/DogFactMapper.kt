package dev.lucasvillaverde.feature_facts.data.network.model

import dev.lucasvillaverde.feature_facts.domain.model.DogFact

fun DogFactResponse.toModel() = DogFact(fact)
fun DogFact.toResponse() = DogFactResponse(fact)