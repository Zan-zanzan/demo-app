package com.example.demo.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// 单例对象生命，Kotlin会创建全局唯一实例
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"

    // 创建retrofit实例 私有不可变
    // .baseurl 设置api基础地址
    // .addconverterfactory 添加json转换器 使用gson
    // .build最终构造retrofit对象
    private val retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()

    // 泛型方法 根据传入的class对象创建服务接口实例
    // fun <T>声明了这是一个泛型函数
    // Class<T>表示运行时动态的获取传入参数的真实类型
    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
}