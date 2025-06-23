package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge // 如果不再需要全面屏，可以移除

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 调用父类初始化

        // 如果你的 activity_main.xml 布局没有使用全面屏的需要，可以移除这行
        enableEdgeToEdge() // 启用全面屏

        // 设置UI内容为 activity_main.xml 布局文件
        setContentView(R.layout.activity_main)
    }
}