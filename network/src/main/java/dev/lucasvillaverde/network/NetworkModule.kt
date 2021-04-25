package dev.lucasvillaverde.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule: DI.Module = DI.Module("NetworkModule") {
    bind<Retrofit>(tag = "DogFactAPI") {
        singleton {
            Retrofit.Builder()
                .baseUrl("https://dog-facts-api.herokuapp.com/api/v1/resources/dogs/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(instance())
                .build()
        }
    }

    bind<Retrofit>(tag = "DogPictureAPI") {
        singleton {
            Retrofit.Builder()
                .baseUrl("https://dog.ceo/api/breeds/image/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(instance())
                .build()
        }
    }

    bind {
        singleton {
            OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC))
                .build()
        }
    }
}