package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration

import com.squareup.moshi.Json


class Configuration {

    private lateinit var images: Images
    @Json(name = "change_keys")
    private var cangeKeys = arrayListOf<String>()
}