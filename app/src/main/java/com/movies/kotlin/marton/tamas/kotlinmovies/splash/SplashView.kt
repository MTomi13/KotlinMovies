package com.movies.kotlin.marton.tamas.kotlinmovies.splash


interface SplashView {

    fun handleError(throwable: Throwable)

    fun requestSuccess()
}