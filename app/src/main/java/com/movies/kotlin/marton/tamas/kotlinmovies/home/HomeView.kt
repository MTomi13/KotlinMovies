package com.movies.kotlin.marton.tamas.kotlinmovies.home

import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent


interface HomeView {

    fun displayContent(responseContent: ResponseContent)

    fun displayError()
}