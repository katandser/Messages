package com.example.messages.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiFactory {

    public fun create(): IApiService {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://who-does-not-know.herokuapp.com/api/")
            .build()
        return retrofit.create(IApiService::class.java)
    }
}