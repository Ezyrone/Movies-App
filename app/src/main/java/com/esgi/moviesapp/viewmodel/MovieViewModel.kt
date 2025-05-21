package com.esgi.moviesapp.viewmodel

import androidx.lifecycle.ViewModel
import com.esgi.moviesapp.data.model.TvShow
import com.esgi.moviesapp.data.repository.MovieRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MovieViewModel(
    private val movieRepository : MovieRepository
): ViewModel() {

    private var _tvShows : MutableStateFlow<List<TvShow>> =
        MutableStateFlow(emptyList())

    val tvShows : StateFlow<List<TvShow>> = _tvShows

}