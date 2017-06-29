package com.movies.kotlin.marton.tamas.kotlinmovies.home.di

@dagger.Module
class HomeActivityModule {

    @dagger.Provides
    fun provideHomeView(mainActivity: com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity): com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeView {
        return mainActivity
    }

    @dagger.Provides
    fun provideHomePresenter(homeView: com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeView, homeInteractorImpl: com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeInteractorImpl): com.movies.kotlin.marton.tamas.kotlinmovies.home.HomePresenterImpl {
        return com.movies.kotlin.marton.tamas.kotlinmovies.home.HomePresenterImpl(homeInteractorImpl, homeView)
    }
}