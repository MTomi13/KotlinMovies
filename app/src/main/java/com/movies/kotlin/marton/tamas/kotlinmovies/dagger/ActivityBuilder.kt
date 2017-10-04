package com.movies.kotlin.marton.tamas.kotlinmovies.dagger

import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.home.di.HomeActivityModule
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.di.SplashActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(SplashActivityModule::class))
    abstract fun bindSplashActivity(): SplashActivity

    @ContributesAndroidInjector(modules = arrayOf(HomeActivityModule::class))
    abstract fun bindHomeActivity(): HomeActivity
}