package com.movies.kotlin.marton.tamas.kotlinmovies.api.popular

import com.squareup.moshi.Json


class ResultWrapper {

    @Json(name = "backdrop_path")
    private lateinit var backdropPath: String
    @Json(name = "first_air_date")
    private lateinit var firstAirDate: String
    @Json(name = "genre_ids")
    private var genreIds = arrayListOf<Int>()
    private var id: Int = 0
    @Json(name = "original_language")
    private lateinit var originalLanguage: String
    @Json(name = "original_name")
    private lateinit var originalName: String
    private lateinit var overview: String
    @Json(name = "origin_country")
    private var originCountry = arrayListOf<String>()
    @Json(name = "poster_path")
    private lateinit var posterPath: String
    private var popularity: Double = 0.0
    @Json(name = "name")
    private lateinit var name: String
    @Json(name = "vote_average")
    private var voteAverage: Double = 0.0
    @Json(name = "vote_count")
    private var voteCount: Int = 0
    @Json(name = "release_date")
    private lateinit var releaseDate: String
    private lateinit var title: String
    @Json(name = "profile_path")
    private lateinit var profilePath: String
    @Json(name = "original_title")
    private lateinit var originalTitle: String
    private lateinit var logoImageUrl: String
    private lateinit var profileImageUrl: String
    private lateinit var backDropImageUrl: String
    private lateinit var contentType: ContentType
}