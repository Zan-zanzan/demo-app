package com.example.demo

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge // 如果不再需要全面屏，可以移除
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 调用父类初始化
        enableEdgeToEdge() // 启用全面屏
        setContentView(R.layout.activity_main)
        val rootView: FrameLayout = findViewById(R.id.main_activity_root_view)
        ViewCompat.setOnApplyWindowInsetsListener(rootView){
            view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.updatePadding(
                left = systemBars.left,
                top = systemBars.top,
                right = systemBars.right,
                bottom = systemBars.bottom
            )
            insets
        }
    }
}