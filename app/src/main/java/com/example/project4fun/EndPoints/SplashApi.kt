package com.example.project4fun.EndPoints

import retrofit2.http.GET
import retrofit2.http.Query

interface SplashApi {

    @GET("/photos")
    suspend fun getData(@Query("client_id") id :String)


}