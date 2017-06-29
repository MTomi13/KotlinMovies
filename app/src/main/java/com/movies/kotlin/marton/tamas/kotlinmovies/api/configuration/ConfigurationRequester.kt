package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration

import com.movies.kotlin.marton.tamas.kotlinmovies.MoviesApplication
import retrofit2.Callback
import javax.inject.Inject


class ConfigurationRequester @Inject constructor(val configurationService: ConfigurationService) {

    fun getConfiguration(callBack: Callback<Configuration>) {
        configurationService.getConfiguration(MoviesApplication.API_KEY).enqueue(callBack)
    }
}