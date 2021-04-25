package dev.lucasvillaverde.base.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.kodein.di.DirectDI
import org.kodein.di.instanceOrNull

class DIViewModelFactory(private val di: DirectDI) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return di.instanceOrNull<ViewModel>(tag = modelClass.simpleName) as T?
            ?: modelClass.newInstance()
    }
}