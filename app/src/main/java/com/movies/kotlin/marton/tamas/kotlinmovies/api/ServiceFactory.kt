package com.movies.kotlin.marton.tamas.kotlinmovies.api

import android.content.Context
import android.net.ConnectivityManager
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationService
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.PopularContentService
import com.movies.kotlin.marton.tamas.kotlinmovies.api.search.SearchService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class ServiceFactory {

    val API_ENDPOINT: String = "http://api.themoviedb.org/3/"

    fun createPopularService(context: Context): PopularContentService {
        return getBuilder(context).build().create(PopularContentService::class.java)
    }

    fun createConfigurationService(context: Context): ConfigurationService {
        return getBuilder(context).build().create(ConfigurationService::class.java)
    }

    fun createSearchService(context: Context): SearchService {
        return getBuilder(context).build().create(SearchService::class.java)
    }

    private fun getBuilder(context: Context): Retrofit.Builder {
        return getRestAdapterBuilder(OkHttpClient.Builder()
                .addInterceptor(getLogger())
                .addInterceptor(NoConnectivityInterceptor(context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager))
                .build(), API_ENDPOINT)
    }

    private fun getRestAdapterBuilder(okHttpClient: OkHttpClient, serviceEndPoint: String): Retrofit.Builder {
        val builder = Retrofit.Builder()
        builder.baseUrl(serviceEndPoint)
        builder.client(okHttpClient)
        builder.addConverterFactory(MoshiConverterFactory.create())
        return builder
    }

    private fun getLogger(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        return interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    }
}