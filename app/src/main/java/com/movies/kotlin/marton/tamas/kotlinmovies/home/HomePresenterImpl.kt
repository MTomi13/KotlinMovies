package com.movies.kotlin.marton.tamas.kotlinmovies.home

import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationResponseStore
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResultWrapper


class HomePresenterImpl(val homeInteractorImpl: HomeInteractorImpl, val homeView: HomeView, val configurationResponseStore: ConfigurationResponseStore)
    : HomeInteractorImpl.HomeInteractorListener {

    lateinit var contentType: ContentType

    init {
        homeInteractorImpl.homeInteractorListener = this
    }

    fun startContentRequest(contentType: ContentType) {
        this.contentType = contentType
        homeInteractorImpl.startContentRequest(contentType)
    }

    fun startSearchRequest(contentType: ContentType, query: String) {
        this.contentType = contentType
        homeInteractorImpl.startSearchRequest(contentType, query)
    }

    private fun setResultsImageUrl(response: ResponseContent): ResponseContent {
        response.contentType = contentType
        val resultWrappers = response.results
        val baseUrl = configurationResponseStore.configuration.images.baseUrl

        resultWrappers.forEach {
            when (contentType) {
                ContentType.MOVIES,
                ContentType.SERIES -> setupBackDropAndLogoImageUrl(it, baseUrl)
                ContentType.PEOPLE -> it.profileImageUrl = baseUrl + configurationResponseStore.configuration.images.profileSizes[3] + it.profilePath
            }
        }
        response.results = resultWrappers
        return response
    }

    private fun setupBackDropAndLogoImageUrl(resultWrapper: ResultWrapper, baseUrl: String) {
        resultWrapper.logoImageUrl = baseUrl + configurationResponseStore.configuration.images.logoSizes[3] + resultWrapper.posterPath
        resultWrapper.backDropImageUrl = baseUrl + configurationResponseStore.configuration.images.backdropSizes[3] + resultWrapper.backdropPath
    }


    override fun onRequestSuccess(responseContent: ResponseContent) {
        homeView.displayContent(setResultsImageUrl(responseContent))
    }

    override fun onRequestFailed(throwable: Throwable) {
        homeView.displayError(throwable)
    }
}