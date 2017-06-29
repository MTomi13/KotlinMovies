package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration

import com.google.gson.annotations.SerializedName


class Configuration {

    private lateinit var images: Images
    @SerializedName("change_keys")
    private var cangeKeys = arrayListOf<String>()
}