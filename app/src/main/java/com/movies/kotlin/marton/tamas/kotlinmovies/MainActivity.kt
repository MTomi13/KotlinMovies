package com.movies.kotlin.marton.tamas.kotlinmovies

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    // if we dont want to intit the variable asap we can do it later
//    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView) as TextView
        textView?.text = "text"


        // if textview is null send 1 back
        val b = textView?.text ?: 1

//        val text: TextView = findViewById(R.id.textView) as TextView
//
//        text?.let {
//            text.text = "Hello Kotlin"
//        }
    }

}
