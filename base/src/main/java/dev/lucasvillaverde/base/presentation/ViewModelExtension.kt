package dev.lucasvillaverde.base.presentation

import androidx.lifecycle.ViewModel
import org.kodein.di.DI
import org.kodein.di.bind

inline fun <reified T : ViewModel> DI.Builder.bindViewModel(overrides: Boolean? = null):
        DI.Builder.TypeBinder<T> = bind<T>(T::class.simpleName, overrides)