package com.movies.kotlin.marton.tamas.kotlinmovies.dagger

import android.app.Activity
import com.movies.kotlin.marton.tamas.kotlinmovies.dagger.activities.HomeActivityComponent
import com.movies.kotlin.marton.tamas.kotlinmovies.dagger.activities.SplashActivityComponent
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import com.movies.kotlin.marton.tamas.kotlinmovies.splash.SplashActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(SplashActivity::class)
    abstract fun bindSplashActivity(builder: SplashActivityComponent.Builder): AndroidInjector.Factory <out Activity>

    @Binds
    @IntoMap
    @ActivityKey(HomeActivity::class)
    abstract fun bindHomeActivity(builder: HomeActivityComponent.Builder): AndroidInjector.Factory <out Activity>
}