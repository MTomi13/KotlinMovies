package com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration

import com.google.gson.annotations.SerializedName


class Images {

    @SerializedName("base_url")
    lateinit var baseUrl: String
    @SerializedName("secure_base_url")
    lateinit var secureBaseUrl: String
    @SerializedName("backdrop_sizes")
    var backdropSizes = ArrayList<String>()
    @SerializedName("logo_sizes")
    var logoSizes: ArrayList<String> = arrayListOf()
    @SerializedName("poster_sizes")
    var posterSizes = arrayListOf<String>()
    @SerializedName("profile_sizes")
    var profileSizes = arrayListOf<String>()
    @SerializedName("still_sizes")
    var stillSizes = arrayListOf<String>()
}