package com.esgi.moviesapp.di

import com.esgi.moviesapp.data.repository.MovieRepository
import com.esgi.moviesapp.data.service.MovieService
import com.esgi.moviesapp.viewmodel.MovieViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object MovieModule {


    @Provides
    @Singleton
    fun provideMovieService() : MovieService{
        return Retrofit.Builder()
            .baseUrl("https://www.episodate.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieService::class.java)
    }


    @Provides
    @Singleton
    fun provideMovieRepository(movieService: MovieService) : MovieRepository {
        return MovieRepository(movieService)
    }

    @Provides
    @Singleton
    fun provideMovieViewModel(movieRepository: MovieRepository) : MovieViewModel{
        return MovieViewModel(movieRepository)
    }

}