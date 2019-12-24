package com.example.messages.api.dto

import com.google.gson.annotations.SerializedName

data class DTOMessage(@SerializedName("id") val id: Int,
                      @SerializedName("text") val text: String,
                      @SerializedName("rendCount") val rendCound: Int,
                      @SerializedName("name") val name: String)