package com.example.github_practices

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ScreenA(modifier: Modifier = Modifier) {
    Column {
        print("Hello World")
        HelloWorldText()
        HelloWorldText()
        HelloWorldText()
        HelloWorldText()
        HelloWorldText()
        HelloWorldText()
    }
}