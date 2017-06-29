package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import com.google.gson.annotations.SerializedName


class ResultWrapper {

    @SerializedName("backdrop_path")
    private lateinit var backdropPath: String
    @SerializedName("first_air_date")
    private lateinit var firstAirDate: String
    @SerializedName("genre_ids")
    private var genreIds = arrayListOf<Int>()
    private var id: Int = 0
    @SerializedName("original_language")
    private lateinit var originalLanguage: String
    @SerializedName("original_name")
    private lateinit var originalName: String
    private lateinit var overview: String
    @SerializedName("origin_country")
    private var originCountry = arrayListOf<String>()
    @SerializedName("poster_path")
    private lateinit var posterPath: String
    private var popularity: Double = 0.0
    @SerializedName("name")
    private lateinit var name: String
    @SerializedName("vote_average")
    private var voteAverage: Double = 0.0
    @SerializedName("vote_count")
    private var voteCount: Int = 0
    @SerializedName("release_date")
    private lateinit var releaseDate: String
    private lateinit var title: String
    @SerializedName("profile_path")
    private lateinit var profilePath: String
    @SerializedName("original_title")
    private lateinit var originalTitle: String
    private lateinit var logoImageUrl: String
    private lateinit var profileImageUrl: String
    private lateinit var backDropImageUrl: String
    private lateinit var contentType: ContentType
}