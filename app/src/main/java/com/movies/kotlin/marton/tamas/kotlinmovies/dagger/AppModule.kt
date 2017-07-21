package com.movies.kotlin.marton.tamas.kotlinmovies.dagger

import android.app.Application
import com.movies.kotlin.marton.tamas.kotlinmovies.api.ServiceFactory
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationRequester
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationResponseStore
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationService
import com.movies.kotlin.marton.tamas.kotlinmovies.home.di.HomeActivityComponent
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.di.SplashActivityComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(subcomponents = arrayOf(SplashActivityComponent::class, HomeActivityComponent::class))
class AppModule(val application: Application) {

    @Provides
    @Singleton
    fun provideConfigurationService(): ConfigurationService {
        return ServiceFactory().createConfigurationService(application)
    }

    @Provides
    @Singleton
    fun provideConfigurationRequester(configurationService: ConfigurationService): ConfigurationRequester {
        return ConfigurationRequester(configurationService)
    }

    @Provides
    @Singleton
    fun provideConfigurationResponseStore(): ConfigurationResponseStore {
        return ConfigurationResponseStore()
    }
}