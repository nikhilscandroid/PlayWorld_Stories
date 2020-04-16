package com.playworld.assignment.network

import com.google.gson.JsonArray
import retrofit2.Call
import retrofit2.http.GET

interface BackEndApi {
    @GET("V0/topstories.json")
    fun STORIES(): Call<JsonArray>

}

