package com.movies.kotlin.marton.tamas.kotlinmovies.splash.di

@dagger.Module
class SplashActivityModule {

    @dagger.Provides
    fun provideSplashView(splashActivity: com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashActivity): com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashView {
        return splashActivity
    }

    @dagger.Provides
    fun provideSplashPresenter(splashInteractor: com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashInteractor, splashView: com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashView): com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashPresenter {
        return com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashPresenter(splashInteractor, splashView)
    }

    @dagger.Provides
    fun provideSplashInteractor(configurationRequester: com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationRequester): com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashInteractor {
        return com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashInteractor(configurationRequester)
    }
}