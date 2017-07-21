package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import com.google.gson.annotations.SerializedName


class ResultWrapper {

    @SerializedName("backdrop_path")
    lateinit var backdropPath: String
    @SerializedName("first_air_date")
    lateinit var firstAirDate: String
    @SerializedName("genre_ids")
    var genreIds = arrayListOf<Int>()
    var id: Int = 0
    @SerializedName("original_language")
    lateinit var originalLanguage: String
    @SerializedName("original_name")
    lateinit var originalName: String
    lateinit var overview: String
    @SerializedName("origin_country")
    var originCountry = arrayListOf<String>()
    @SerializedName("poster_path")
    lateinit var posterPath: String
    var popularity: Double = 0.0
    @SerializedName("name")
    lateinit var name: String
    @SerializedName("vote_average")
    var voteAverage: Double = 0.0
    @SerializedName("vote_count")
    var voteCount: Int = 0
    @SerializedName("release_date")
    lateinit var releaseDate: String
    lateinit var title: String
    @SerializedName("profile_path")
    lateinit var profilePath: String
    @SerializedName("original_title")
    lateinit var originalTitle: String
    lateinit var logoImageUrl: String
    lateinit var profileImageUrl: String
    lateinit var backDropImageUrl: String
    lateinit var contentType: ContentType
}