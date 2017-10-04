package com.movies.kotlin.marton.tamas.kotlinmovies.home.di

import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationResponseStore
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeInteractorImpl
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomePresenterImpl
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeView
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule {

    @Provides
    fun provideHomeView(mainActivity: HomeActivity): HomeView {
        return mainActivity
    }

    @Provides
    fun provideHomePresenter(homeInteractorImpl: HomeInteractorImpl, homeView: HomeView, configurationResponseStore: ConfigurationResponseStore): HomePresenterImpl {
        return HomePresenterImpl(homeInteractorImpl, homeView, configurationResponseStore)
    }
}