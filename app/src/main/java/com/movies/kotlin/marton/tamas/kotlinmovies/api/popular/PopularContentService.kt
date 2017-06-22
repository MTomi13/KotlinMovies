package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface PopularContentService {

    @GET("movie/popular")
    fun getPopularMovies(@Query("api_key") apiKey: String): Call<ResponseContent>

    @GET("tv/popular")
    fun getPopularSeries(@Query("api_key") apiKey: String): Call<ResponseContent>

    @GET("person/popular")
    fun getPopularPeople(@Query("api_key") apiKey: String): Call<ResponseContent>
}