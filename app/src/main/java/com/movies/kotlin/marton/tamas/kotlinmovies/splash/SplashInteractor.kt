package com.movies.kotlin.marton.tamas.kotlinmovies.splash

import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.Configuration
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationRequester
import com.movies.kotlin.marton.tamas.kotlinmovies.api.configuration.ConfigurationResponseStore
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashInteractor(val configurationRequester: ConfigurationRequester, val configurationResponseStore: ConfigurationResponseStore) : Callback<Configuration> {

    lateinit var splashInteractorListener: SplashInteractorListener

    fun startRequestConfiguration() {
        configurationRequester.getConfiguration(this)
    }

    override fun onResponse(call: Call<Configuration>?, response: Response<Configuration>) {
        configurationResponseStore.configuration = response.body()
        splashInteractorListener.onConfigurationResponseSuccess()
    }

    override fun onFailure(call: Call<Configuration>?, throwable: Throwable?) {
        throwable?.let { splashInteractorListener.onConfigurationResponseFailed(throwable) }
    }

    interface SplashInteractorListener {

        fun onConfigurationResponseSuccess()

        fun onConfigurationResponseFailed(throwable: Throwable)
    }
}