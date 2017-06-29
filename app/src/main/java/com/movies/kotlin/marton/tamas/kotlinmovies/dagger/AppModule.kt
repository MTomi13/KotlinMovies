package com.movies.kotlin.marton.tamas.kotlinmovies.dagger

import android.app.Application
import android.content.Context
import com.movies.kotlin.marton.tamas.kotlinmovies.api.ServiceFactory
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationRequester
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationService
import com.movies.kotlin.marton.tamas.kotlinmovies.dagger.activities.HomeActivityComponent
import com.movies.kotlin.marton.tamas.kotlinmovies.dagger.activities.SplashActivityComponent
import dagger.Module
import dagger.Provides
import dagger.android.DaggerApplication
import javax.inject.Singleton


@Module(subcomponents = arrayOf(SplashActivityComponent::class, HomeActivityComponent::class))
class AppModule (val application: Application) {

//    lateinit var application: Application

//    @Provides
//    @Singleton
//    fun provideContext(application: Application): Context {
//        return application
//    }

    @Provides
    @Singleton
    fun provideConfigurationService(): ConfigurationService {
        // application will never be initialise
        return ServiceFactory().createConfigurationService(application)
    }

    @Provides
    @Singleton
    fun provideConfigurationRequester(configurationService: ConfigurationService): ConfigurationRequester {
        return ConfigurationRequester(configurationService)
    }
}