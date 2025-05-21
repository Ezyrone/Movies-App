package com.esgi.moviesapp.data.repository

import com.esgi.moviesapp.data.model.TvShow
import com.esgi.moviesapp.data.service.MovieService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class MovieRepository @Inject constructor(
    private val movieService: MovieService
) {

//    suspend fun getTvShows(page: Int = 1): List<TvShow> {
//        return movieService.getMoviesResponse(page)
//            .tvShows
//    }

    fun getTvShows(page: Int = 1): Flow<List<TvShow>> = flow {
        emit(movieService.getMoviesResponse(page).tvShows)
    }
}


