package com.example.demo.data.model

import com.google.gson.annotations.SerializedName

// List为不可变的有序集合
data class PlaceResponse(val status: String, val places: List<Place>)

// 其中@SerializedName将json中的"formatted_address"映射成了类address属性
data class Place(
    val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)
