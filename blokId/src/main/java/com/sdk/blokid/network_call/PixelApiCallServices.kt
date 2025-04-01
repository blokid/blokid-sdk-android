package com.sdk.blokid.network_call

import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PixelApiCallServices {

    @POST("/track")
    suspend fun pixelEventTracker(@Body params: HashMap<String,Any>): Response<JsonObject>


}