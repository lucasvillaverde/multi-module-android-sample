package dev.lucasvillaverde.feature_facts.data

import dev.lucasvillaverde.feature_facts.data.network.service.DogFactService
import dev.lucasvillaverde.feature_facts.data.network.service.DogPictureService
import dev.lucasvillaverde.feature_facts.domain.repository.DogFactRepository
import dev.lucasvillaverde.feature_facts.domain.repository.DogPictureRepository
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton
import retrofit2.Retrofit

val dataModule = DI.Module("DataModule") {
    bind<DogFactService> {
        singleton {
            instance<Retrofit>(tag = "DogFactAPI").create(DogFactService::class.java)
        }
    }

    bind<DogPictureService> {
        singleton {
            instance<Retrofit>(tag = "DogPictureAPI").create(DogPictureService::class.java)
        }
    }

    bind<DogFactRepository> { singleton { DogFactsRepositoryImpl(instance()) } }
    bind<DogPictureRepository> { singleton { DogPictureRepositoryImpl(instance()) } }
}