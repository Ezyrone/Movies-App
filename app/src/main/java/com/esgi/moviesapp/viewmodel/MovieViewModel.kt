package com.esgi.moviesapp.viewmodel

import androidx.lifecycle.ViewModel
import com.esgi.moviesapp.data.repository.MovieRepository

class MovieViewModel(
    private val movieRepository : MovieRepository
): ViewModel() {


}