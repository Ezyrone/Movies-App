package com.esgi.moviesapp.data.service

import com.esgi.moviesapp.data.model.MovieResponse
import retrofit2.http.GET

interface MovieService {

    @GET("most-popular")
    fun getMoviesResponse() : MovieResponse
}