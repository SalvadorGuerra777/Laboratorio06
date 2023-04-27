package com.example.laboratorio_06guerra.repositories

import com.example.laboratorio_06guerra.data.model.MovieModel

class MovieRepository (private  val movies: MutableList<MovieModel>){
    fun getMovies ()= movies
    fun setMovies (movie: MovieModel) = movies.add(movie)
}