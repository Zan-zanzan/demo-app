package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.demo.ui.theme.DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 调用父类初始化
        enableEdgeToEdge() // 启用全面屏
        setContent { // 设置UI内容
            DemoTheme { // 应用自定义主题
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> // 布局脚手架​​：提供Material Design基础结构
                    Greeting( // 显示主要内容
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable // 声明可组合函数：可被渲染的UI组件
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true) // 预览注解：在Android Studio右侧显示UI效果
@Composable // 专用于预览的组合函数
fun GreetingPreview() {
    DemoTheme {
        Greeting("Android")
    }
}