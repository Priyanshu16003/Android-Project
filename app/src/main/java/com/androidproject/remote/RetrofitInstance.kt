package com.androidproject.remote

import com.androidproject.constants.ApiConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val retrofitInstance by lazy {
        Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService by lazy {
       retrofitInstance.create(ApiService::class.java)
    }

    //Configure Okhttp Client and Interceptors
}