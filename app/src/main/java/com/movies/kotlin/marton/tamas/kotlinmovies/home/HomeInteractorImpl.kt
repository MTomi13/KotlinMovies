package com.movies.kotlin.marton.tamas.kotlinmovies.home

import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.PopularContentRequester
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent
import com.movies.kotlin.marton.tamas.kotlinmovies.api.search.SearchRequester
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeInteractorImpl(val popularContentRequester: PopularContentRequester, val searchRequester: SearchRequester) : Callback<ResponseContent> {

    lateinit var homeInteractorListener: HomeInteractorListener

    fun startContentRequest(contentType: ContentType) {
        popularContentRequester.getPopularContent(contentType, this)
    }

    fun startSearchRequest(contentType: ContentType, query: String) {
        searchRequester.getSearchResult(contentType, query, this)
    }

    override fun onResponse(call: Call<ResponseContent>?, response: Response<ResponseContent>?) {
        response?.let {
            homeInteractorListener.onRequestSuccess(response.body())
        }
    }

    override fun onFailure(call: Call<ResponseContent>?, throwable: Throwable) {
        homeInteractorListener.onRequestFailed(throwable)
    }

    interface HomeInteractorListener {

        fun onRequestSuccess(responseContent: ResponseContent)

        fun onRequestFailed(throwable: Throwable)
    }
}