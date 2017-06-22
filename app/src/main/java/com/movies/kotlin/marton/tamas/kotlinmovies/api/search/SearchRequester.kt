package com.movies.kotlin.marton.tamas.kotlinmovies.api.search

import com.movies.kotlin.marton.tamas.kotlinmovies.MoviesApplication
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType.*
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent
import retrofit2.Callback


class SearchRequester(val searchService: SearchService) {

    fun getSearchResult(contentType: ContentType, query: String, callBack: Callback<ResponseContent>) {
        when (contentType) {
            MOVIES -> searchService.getSearchMovies(MoviesApplication.API_KEY, query).enqueue(callBack)
            SERIES -> searchService.getSearchSeries(MoviesApplication.API_KEY, query).enqueue(callBack)
            PEOPLE -> searchService.getSearchPeople(MoviesApplication.API_KEY, query).enqueue(callBack)
        }
    }
}