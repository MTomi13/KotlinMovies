package com.movies.kotlin.marton.tamas.kotlinmovies.dagger.activities

import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationRequester
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashInteractor
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashPresenter
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashView
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    fun provideSplashView(splashActivity: SplashActivity): SplashView {
        return splashActivity
    }

    @Provides
    fun provideSplashPresenter(splashInteractor: SplashInteractor, splashView: SplashView): SplashPresenter {
        return SplashPresenter(splashInteractor, splashView)
    }

    @Provides
    fun provideSplashInteractor(configurationRequester: ConfigurationRequester): SplashInteractor {
        return SplashInteractor(configurationRequester)
    }
}