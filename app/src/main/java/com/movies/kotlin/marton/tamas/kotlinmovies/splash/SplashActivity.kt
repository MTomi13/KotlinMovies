package com.movies.kotlin.marton.tamas.kotlinmovies.splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.movies.kotlin.marton.tamas.kotlinmovies.R
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_splash.*
import javax.inject.Inject


class SplashActivity : AppCompatActivity(), SplashView {

    @Inject lateinit var presenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setProgressRingVisibility(View.VISIBLE)
        presenter.startConfRequest()
    }

    private fun setProgressRingVisibility(visibility: Int) {
        progress_ring.visibility = visibility
    }

    override fun requestSuccess() {
        setProgressRingVisibility(View.GONE)
        startHomeActivity()
    }

    private fun startHomeActivity() {
        val intent = Intent(this@SplashActivity, HomeActivity::class.java)
        startActivity(intent)
    }

    override fun handleError(throwable: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}