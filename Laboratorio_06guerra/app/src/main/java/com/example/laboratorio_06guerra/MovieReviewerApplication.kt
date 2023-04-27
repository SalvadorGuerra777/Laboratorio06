package com.example.laboratorio_06guerra

import android.app.Application
import com.example.laboratorio_06guerra.data.model.movies
import com.example.laboratorio_06guerra.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}