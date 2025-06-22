package com.example.demo.data.network

import com.example.demo.SunnyWeatherApplication
import com.example.demo.data.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    // @GET注解，调用下面方法的时候Retrofit会自动发起一条GET请求
    // 访问GET注解中配置的地址
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}