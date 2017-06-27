package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import com.squareup.moshi.Json


class ResponseContent {

    private var page: Int = 0
    var results = arrayListOf<ResultWrapper>()
    @Json(name = "total_pages")
    private var totalPages: Int = 0
    @Json(name = "total_results")
    private var totalResults: Int = 0
    lateinit var contentType: ContentType
}