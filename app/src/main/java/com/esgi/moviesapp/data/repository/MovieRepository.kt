package com.esgi.moviesapp.data.repository

import com.esgi.moviesapp.data.model.TvShow
import com.esgi.moviesapp.data.service.MovieService
import kotlinx.coroutines.flow.Flow

class MovieRepository(
    private val movieService: MovieService
) {

    suspend fun getTvShows(page: Int = 1): List<TvShow> {
        return movieService.getMoviesResponse(page)
            .tvShows
    }
}