package com.dhairyaparikh.cloudpoint

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
z
interface ApiInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city:String,
        @Query("appid") appid: String,
        @Query("units") units: String
        ) : Call<CloudPoint>
}