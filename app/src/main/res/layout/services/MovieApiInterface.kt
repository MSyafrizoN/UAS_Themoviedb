package com.uas_tmdb.services

import com.uas_tmdb.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=6f00f727d8cf82e81b217cd083574149")
    fun getMovieList(): Call<MovieResponse>

}