package dev.lucasvillaverde.base.presentation

import androidx.lifecycle.ViewModelProvider
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.singleton

val viewModelModule = DI.Module("ViewModelModule") {
    bind<ViewModelProvider.Factory>() with singleton { DIViewModelFactory(directDI) }
}