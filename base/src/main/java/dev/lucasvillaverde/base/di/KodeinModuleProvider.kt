package dev.lucasvillaverde.base.di

import org.kodein.di.DI

interface KodeinModuleProvider {
    val kodeinModule: DI.Module
}