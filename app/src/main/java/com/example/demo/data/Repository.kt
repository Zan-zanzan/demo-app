package com.example.demo.data

import androidx.lifecycle.liveData
import com.example.demo.data.model.Place
import com.example.demo.data.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        // 在kotlin中try catch不仅仅是一个语句块，也是一个表达式可以有返回值
        // if when try这种结构都是表达式，有返回值
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}