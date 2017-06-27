package com.movies.kotlin.marton.tamas.kotlinmovies.util

import android.content.SearchRecentSuggestionsProvider


class SuggestionProvider : SearchRecentSuggestionsProvider() {

    val AUTHORITY = "com.movies.kotlin.marton.tamas.kotlinmovies.util.SuggestionProvider"
    val MODE = DATABASE_MODE_QUERIES

    init {
        setupSuggestions(AUTHORITY, MODE)
    }
}