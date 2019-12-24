package com.example.messages.api

interface IApiCallback<T> {

    fun onData(data: T)
    fun onError()
}