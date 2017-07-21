package com.movies.kotlin.marton.tamas.kotlinmovies.home

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ContentType
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResponseContent
import com.movies.kotlin.marton.tamas.kotlinmovies.api.popular.ResultWrapper
import android.view.LayoutInflater
import com.movies.kotlin.marton.tamas.kotlinmovies.R


class HomeAdapter (val responseContent: ResponseContent, val homeAdapterClickListener: HomeAdapterClickListener) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun getItemCount(): Int {
      return responseContent.results.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_list_item, parent, false)
        return HomeViewHolder(view)
    }

    class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind (resultWrapper: ResultWrapper, homeAdapterClickListener: HomeAdapterClickListener){

        }
    }

    interface HomeAdapterClickListener {

        fun onItemClicked(resultWrapper: ResultWrapper, contentType: ContentType)
    }

}