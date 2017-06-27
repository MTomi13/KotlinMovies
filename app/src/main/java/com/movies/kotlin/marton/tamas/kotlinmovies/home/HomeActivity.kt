package com.movies.kotlin.marton.tamas.kotlinmovies.home

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.View
import com.movies.kotlin.marton.tamas.kotlinmovies.R
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

//    private var textView: TextView? = null

    // if we dont want to intit the variable asap we can do it later
//    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // with android extensions
//        textView1.text = "Hello android extension"

//        textView = findViewById(R.id.textView) as TextView
//        textView?.text = "text"


        // if textview is null send 1 back
//        val b = textView?.text ?: 1

//        val text: TextView = findViewById(R.id.textView) as TextView
//
//        text?.let {
//            text.text = "Hello Kotlin"
//        }

        setSupportActionBar(toolbar)

        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
    }

    fun setupBottomBar() {
        bottomBar.setItems(R.xml.bottom_bar_menu)
        bottomBar.setOnTabSelectListener({ tabId ->
            when (tabId) {
                R.id.bottomBarItemOne -> bottomBarClicked(ContentType.MOVIES)
                R.id.bottomBarItemTwo -> bottomBarClicked(ContentType.SERIES)
                R.id.bottomBarItemThree -> bottomBarClicked(ContentType.PEOPLE)

            }
        })
        bottomBar.setOnTabReselectListener({ recyclerview.smoothScrollToPosition(0) })
    }

    fun bottomBarClicked(contentType: ContentType) {
        home_progress_bar.visibility = View.VISIBLE
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        menu?.let {
            setupSearchView(menu)
        }
        return super.onCreateOptionsMenu(menu)
    }

    private fun setupSearchView(menu: Menu) {
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = menu.findItem(R.id.menu_search).actionView as SearchView
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.setIconifiedByDefault(true)
        searchView.isSubmitButtonEnabled = true
        searchView.isQueryRefinementEnabled = true
    }

    override fun onNewIntent(intent: Intent?) {
        setIntent(intent)
        super.onNewIntent(intent)
    }
}