package com.example.messages

import androidx.multidex.MultiDexApplication
import com.example.messages.api.ApiFactory
import com.example.messages.api.ApiService
import com.example.messages.api.IApiService
import retrofit2.Call

class MessagesApplication : MultiDexApplication() {

    public var api : IApiService? = null
    override fun onCreate() {
        super.onCreate()
        api = ApiFactory().create()
    }
}
