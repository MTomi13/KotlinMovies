package com.movies.kotlin.marton.tamas.kotlinmovies.home.di

import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeInteractorImpl
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomePresenterImpl
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeView

@dagger.Module
class HomeActivityModule {

    @dagger.Provides
    fun provideHomeView(mainActivity: HomeActivity): HomeView {
        return mainActivity
    }

    @dagger.Provides
    fun provideHomePresenter(homeView: HomeView, homeInteractorImpl: HomeInteractorImpl): HomePresenterImpl {
        return com.movies.kotlin.marton.tamas.kotlinmovies.home.HomePresenterImpl(homeInteractorImpl, homeView)
    }
}