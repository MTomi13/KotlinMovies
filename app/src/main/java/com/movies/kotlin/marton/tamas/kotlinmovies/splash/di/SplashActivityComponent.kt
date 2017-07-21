package com.movies.kotlin.marton.tamas.kotlinmovies.splash.di

import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules =
arrayOf(SplashActivityModule::class))
interface SplashActivityComponent : AndroidInjector<SplashActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SplashActivity>()
}