package dev.lucasvillaverde.feature_facts.presentation

import android.app.Application
import com.squareup.picasso.Picasso
import dev.lucasvillaverde.base.presentation.bindViewModel
import org.kodein.di.*
import org.kodein.di.android.ActivityRetainedScope

val presentationModule = DI.Module("PresentationModule") {
    bindViewModel<FactsViewModel>() with provider {
        FactsViewModel(instance(), instance())
    }
    bind<Picasso>() {
        scoped(ActivityRetainedScope).singleton { Picasso.Builder(instance<Application>()).build() }
    }
}