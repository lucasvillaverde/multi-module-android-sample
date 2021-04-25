package dev.lucasvillaverde.base

import android.app.Application
import dev.lucasvillaverde.base.di.KodeinModuleProvider
import dev.lucasvillaverde.base.presentation.viewModelModule
import dev.lucasvillaverde.network.networkModule
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.x.androidXModule

class DogFactsApplication : Application(), DIAware {
    override val di by DI.lazy {
        import(androidXModule(this@DogFactsApplication))
        import(viewModelModule)
        import(networkModule)
        import(
            (Class
                .forName("dev.lucasvillaverde.feature_facts.FeatureFactsModule")
                .kotlin
                .objectInstance as KodeinModuleProvider).kodeinModule
        )
    }
}