package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration

import com.squareup.moshi.Json


class Images {

    @Json(name = "base_url")
    private lateinit var baseUrl: String
    @Json(name = "secure_base_url")
    private lateinit var secureBaseUrl: String
    @Json(name = "backdrop_sizes")
    private var backdropSizes = ArrayList<String>()
    @Json(name = "logo_sizes")
    private var logoSizes: ArrayList<String> = arrayListOf()
    @Json(name = "poster_sizes")
    private var posterSizes = arrayListOf<String>()
    @Json(name = "profile_sizes")
    private var profileSizes = arrayListOf<String>()
    @Json(name = "still_sizes")
    private var stillSizes = arrayListOf<String>()
}