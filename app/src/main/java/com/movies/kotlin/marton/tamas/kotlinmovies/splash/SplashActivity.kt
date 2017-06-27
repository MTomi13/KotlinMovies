package com.movies.kotlin.marton.tamas.kotlinmovies.splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.movies.kotlin.marton.tamas.kotlinmovies.R
import com.movies.kotlin.marton.tamas.kotlinmovies.home.HomeActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity(), SplashView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setProgressRingVisibility(View.VISIBLE)
    }

    private fun setProgressRingVisibility(visibility: Int) {
        progress_ring.visibility = visibility
    }

    private fun startHomeActivity() {
        val intent = Intent(this@SplashActivity, HomeActivity::class.java)
        startActivity(intent)
    }

    override fun requestSuccess() {
        setProgressRingVisibility(View.GONE)
        startHomeActivity()
    }

    override fun handleError(throwable: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}