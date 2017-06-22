package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration


class Configuration {

    private lateinit var images: Images
    @com.squareup.moshi.Json(name = "change_keys")
    private var cangeKeys = arrayListOf<String>()
}