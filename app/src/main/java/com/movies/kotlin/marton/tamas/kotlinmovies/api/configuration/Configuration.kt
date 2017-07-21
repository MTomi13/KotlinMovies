package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration

import com.google.gson.annotations.SerializedName


class Configuration {

    lateinit var images: Images
    @SerializedName("change_keys")
    var cangeKeys = arrayListOf<String>()
}