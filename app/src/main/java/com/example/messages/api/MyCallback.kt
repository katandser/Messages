package com.example.messages.api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyCallback<T>(callback: IApiCallback<T>) : Callback<T> {

    val callback: IApiCallback<T> = callback

    override fun onResponse(call: Call<T>, response: Response<T>) {
        response.body()?.let { callback.onData(it) }
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}