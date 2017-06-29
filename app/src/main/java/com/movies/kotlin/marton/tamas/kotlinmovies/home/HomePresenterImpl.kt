package com.movies.kotlin.marton.tamas.kotlinmovies.home

import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResultWrapper
import retrofit2.Response


class HomePresenterImpl(val homeInteractorImpl: HomeInteractorImpl, val homeView: HomeView) : HomeInteractorImpl.HomeInteractorListener {

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

//    private ResponseContent setResultsImageUrl(Response<ResponseContent> response) {
//        response.body().setContentType(contentType);
//        List<ResultWrapper> resultWrappers = response.body().getResultWrappers();
//        String baseUlr = configurationResponseStore.getConfiguration().getImages().getBaseUrl();
//        for (ResultWrapper resultWrapper : resultWrappers) {
//            switch (contentType) {
//                case MOVIES:
//                case SERIES:
//                resultWrapper.setLogoImageUrl(baseUlr + configurationResponseStore.getConfiguration().getImages().getLogoSizes().get(3) + resultWrapper.getPosterPath());
//                resultWrapper.setBackDropImageUrl(baseUlr + configurationResponseStore.getConfiguration().getImages().getBackdropSizes().get(3) + resultWrapper.getBackdropPath());
//                break;
//                case PEOPLE:
//                resultWrapper.setProfileImageUrl(baseUlr + configurationResponseStore.getConfiguration().getImages().getProfileSizes().get(3) + resultWrapper.getProfilePath());
//                break;
//            }
//        }
//        response.body().setResultWrappers(resultWrappers);
//        return response.body();
//    }

//    private fun setResultsImageUrl(response: Response<ResponseContent>): ResponseContent {
//        response.body().contentType = contentType
//        var resultWrappers = listOf<ResultWrapper>()
//        resultWrappers = response.body().results
//    }

    override fun onRequestSuccess(responseContent: ResponseContent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRequestFailed(throwable: Throwable?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}