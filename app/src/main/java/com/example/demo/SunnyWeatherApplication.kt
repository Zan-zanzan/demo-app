package com.example.demo

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    // 可以方便的获取context对象
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "UaC1XvUew7vts2Md"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}