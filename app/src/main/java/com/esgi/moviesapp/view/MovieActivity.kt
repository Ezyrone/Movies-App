package com.esgi.moviesapp.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.esgi.moviesapp.data.repository.MovieRepository
import com.esgi.moviesapp.ui.theme.MoviesAppTheme
import com.esgi.moviesapp.viewmodel.MovieViewModel

class MovieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MoviesAppTheme {



            }
        }
    }
}