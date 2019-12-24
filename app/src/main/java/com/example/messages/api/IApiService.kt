package com.example.messages.api

import com.example.messages.api.dto.DTOMessage
import retrofit2.Call
import retrofit2.http.GET

interface IApiService {

    @GET("mails")
    public fun getMessages() : Call<List<DTOMessage>>
}