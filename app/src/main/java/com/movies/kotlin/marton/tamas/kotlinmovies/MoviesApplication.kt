package com.movies.kotlin.marton.tamas.kotlinmovies

import android.app.Activity
import android.app.Application
import com.movies.kotlin.marton.tamas.kotlinmovies.dagger.AppModule
import com.movies.kotlin.marton.tamas.kotlinmovies.dagger.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class MoviesApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    companion object {

        const val API_KEY = "d0aea524bd07ed49cbc26dff63f357dd"
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
                .application(this)
                .appModule(AppModule(this))
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityDispatchingAndroidInjector
    }
}