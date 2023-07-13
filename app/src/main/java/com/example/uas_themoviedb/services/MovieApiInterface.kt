package com.example.uas_themoviedb.services

import com.example.uas_themoviedb.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=b77ebd788819d0d89ddf19226abce500")
    fun getMovieList(): Call<MovieResponse>

}