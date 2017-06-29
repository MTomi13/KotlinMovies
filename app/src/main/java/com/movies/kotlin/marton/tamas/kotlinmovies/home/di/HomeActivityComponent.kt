package com.movies.kotlin.marton.tamas.kotlinmovies.home.di

import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = arrayOf(HomeActivityModule::class))
interface HomeActivityComponent : AndroidInjector<HomeActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<HomeActivity>()
}