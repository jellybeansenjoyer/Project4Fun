package com.example.project4fun.EndPoints

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitUnsplashInstance {

    private val retrofit : Retrofit by lazy{
        Retrofit.Builder().baseUrl("https://api.unsplash.com/").addConverterFactory(GsonConverterFactory.create()).build()
    }

    val splashApi : SplashApi by lazy{
        retrofit.create(SplashApi::class.java)
    }
}

