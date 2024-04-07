package com.androidproject.remote

import com.androidproject.constants.ApiMethods
import okhttp3.Response
import retrofit2.http.GET

interface ApiService {

    @GET(ApiMethods.METHOD_GET_DATA)
    suspend fun getData() : Response
}