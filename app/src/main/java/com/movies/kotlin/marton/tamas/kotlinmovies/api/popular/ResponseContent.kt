package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import com.google.gson.annotations.SerializedName


class ResponseContent {

    private var page: Int = 0
    var results = arrayListOf<ResultWrapper>()
    @SerializedName("total_pages")
    private var totalPages: Int = 0
    @SerializedName("total_results")
    private var totalResults: Int = 0
    lateinit var contentType: ContentType
}