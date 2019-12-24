package com.example.messages.api

class ApiService(api: IApiService) {

    val api: IApiService = api
    public fun getMessages() {

        api.getMessages()
    }
}