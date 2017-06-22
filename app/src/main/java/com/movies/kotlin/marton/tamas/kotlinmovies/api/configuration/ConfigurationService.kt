package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration


interface ConfigurationService {

    @retrofit2.http.GET("configuration")
    fun getConfiguration(@retrofit2.http.Query("api_key") apiKey: String): retrofit2.Call<Configuration>
}