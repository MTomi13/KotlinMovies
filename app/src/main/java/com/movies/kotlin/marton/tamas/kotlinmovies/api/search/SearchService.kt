package com.movies.kotlin.marton.tamas.kotlinmovies.api.search

import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface SearchService {

    @GET("search/movie")
    fun getSearchMovies(@Query("api_key") apiKey: String, @Query("query") query: String): Call<ResponseContent>

    @GET("search/tv")
    fun getSearchSeries(@Query("api_key") apiKey: String, @Query("query") query: String): Call<ResponseContent>

    @GET("search/person")
    fun getSearchPeople(@Query("api_key") apiKey: String, @Query("query") query: String): Call<ResponseContent>
}