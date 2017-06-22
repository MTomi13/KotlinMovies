package com.movies.kotlin.marton.tamas.kotlinmovies.api


class NoConnectivityException : Exception() {

    override val message: String?
        get() = "Internet connection error! Pls connect to the internet!"
}