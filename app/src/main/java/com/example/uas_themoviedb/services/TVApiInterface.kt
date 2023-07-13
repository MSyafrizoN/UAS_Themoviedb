package com.example.uas_themoviedb.services

import com.example.uas_themoviedb.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=b77ebd788819d0d89ddf19226abce500")
    fun getTVList(): Call<TVResponse>
}