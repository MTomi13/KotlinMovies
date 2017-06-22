package com.movies.kotlin.marton.tamas.kotlinmovies.api

import android.net.ConnectivityManager
import okhttp3.Interceptor
import okhttp3.Response


class NoConnectivityInterceptor(val connectivityManager: ConnectivityManager) : Interceptor {

    override fun intercept(chain: Interceptor.Chain?): Response? {
        if (!isConnected()) {
            throw NoConnectivityException()
        }
        val builder = chain?.request()?.newBuilder()
        return chain?.proceed(builder?.build())
    }

    private fun isConnected(): Boolean {
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnectedOrConnecting
    }
}