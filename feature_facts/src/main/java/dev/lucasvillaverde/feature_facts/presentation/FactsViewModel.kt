package dev.lucasvillaverde.feature_facts.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dev.lucasvillaverde.feature_facts.data.network.model.toModel
import dev.lucasvillaverde.feature_facts.data.network.service.DogPictureService
import dev.lucasvillaverde.feature_facts.domain.model.DogFact
import dev.lucasvillaverde.feature_facts.domain.model.DogPicture
import dev.lucasvillaverde.feature_facts.domain.repository.DogFactRepository
import dev.lucasvillaverde.feature_facts.domain.repository.DogPictureRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class FactsViewModel(
    private val dogFactRepository: DogFactRepository,
    private val dogPictureRepository: DogPictureRepository
) : ViewModel() {
    val dogFacts = MutableLiveData<List<DogFact>>()
    val dogPicture = MutableLiveData<DogPicture>()

    fun fetchDogFacts() {
        viewModelScope.launch {
            dogFactRepository.getDogFacts().collect {
                dogFacts.postValue(it)
            }
        }
    }

    fun fetchDogPicture() {
        viewModelScope.launch {
            dogPictureRepository.getDogPicture().collect {
                dogPicture.postValue(it)
            }
        }
    }
}