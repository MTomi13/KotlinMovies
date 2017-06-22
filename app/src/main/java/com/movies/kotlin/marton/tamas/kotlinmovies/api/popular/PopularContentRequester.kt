package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import com.movies.kotlin.marton.tamas.kotlinmovies.MoviesApplication
import retrofit2.Callback


class PopularContentRequester(val popularContentService: PopularContentService) {

    fun getPopularContent(contentType: ContentType, callBack: Callback<ResponseContent>) {
        when (contentType) {
            ContentType.MOVIES -> popularContentService.getPopularMovies(MoviesApplication.API_KEY).enqueue(callBack)
            ContentType.SERIES -> popularContentService.getPopularSeries(MoviesApplication.API_KEY).enqueue(callBack)
            ContentType.PEOPLE -> popularContentService.getPopularPeople(MoviesApplication.API_KEY).enqueue(callBack)
        }

    }
}