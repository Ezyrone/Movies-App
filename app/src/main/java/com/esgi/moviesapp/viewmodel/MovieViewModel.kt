package com.esgi.moviesapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esgi.moviesapp.data.model.TvShow
import com.esgi.moviesapp.data.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MovieViewModel(
    private val movieRepository : MovieRepository
): ViewModel() {

    private var _tvShows : MutableStateFlow<List<TvShow>> =
        MutableStateFlow(emptyList())

    val tvShows : StateFlow<List<TvShow>> = _tvShows

    init {
        getTvShows()
    }

    fun getTvShows(page : Int = 1) = viewModelScope.launch(
        Dispatchers.IO
    ) {
        movieRepository.getTvShows(page).collectLatest { tvShows ->
            _tvShows.value = tvShows
        }
    }
}