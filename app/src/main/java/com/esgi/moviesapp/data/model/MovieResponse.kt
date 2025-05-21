package com.esgi.moviesapp.data.model


import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("tv_shows")
    val tvShows: List<TvShow>
)