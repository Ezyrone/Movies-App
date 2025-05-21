package com.esgi.moviesapp.data.service

import androidx.contentpager.content.Query
import com.esgi.moviesapp.data.model.MovieResponse
import retrofit2.http.GET

interface MovieService {

    @GET("most-popular")
    suspend fun getMoviesResponse(
        @Query("page") page : Int = 1
    ) : MovieResponse
}