package com.movies.kotlin.marton.tamas.kotlinmovies.splash


class SplashPresenter(val splashInteractor: SplashInteractor, val splashView: SplashView) : SplashInteractor.SplashInteractorListener {

    init {
        splashInteractor.splashInteractorListener = this
    }

    override fun onConfigurationResponseFailed(throwable: Throwable) {
        splashView.handleError(throwable)
    }

    override fun onConfigurationResponseSuccess() {
        splashView.requestSuccess()
    }
}