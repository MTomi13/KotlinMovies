package com.movies.kotlin.marton.tamas.kotlinmovies.splash.di

import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationRequester
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashInteractor
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashPresenter
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashView

@dagger.Module
class SplashActivityModule {

    @dagger.Provides
    fun provideSplashView(splashActivity: SplashActivity): SplashView {
        return splashActivity
    }

    @dagger.Provides
    fun provideSplashPresenter(splashInteractor: SplashInteractor, splashView: SplashView): SplashPresenter {
        return com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashPresenter(splashInteractor, splashView)
    }

    @dagger.Provides
    fun provideSplashInteractor(configurationRequester: ConfigurationRequester): SplashInteractor {
        return com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashInteractor(configurationRequester)
    }
}