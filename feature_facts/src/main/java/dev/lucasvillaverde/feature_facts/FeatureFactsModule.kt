package dev.lucasvillaverde.feature_facts

import dev.lucasvillaverde.base.di.KodeinModuleProvider
import dev.lucasvillaverde.feature_facts.data.dataModule
import dev.lucasvillaverde.feature_facts.presentation.presentationModule
import org.kodein.di.DI

object FeatureFactsModule : KodeinModuleProvider {
    override val kodeinModule: DI.Module = DI.Module("FeatureFactsModule") {
        import(dataModule)
        import(presentationModule)
    }
}