package com.example.github_practices

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HelloWorldText(modifier: Modifier = Modifier) {
    Text(text = "Hello World!!" , modifier = modifier)
    Text(text = "Hello World!!!" , modifier = modifier)
    Text(text = "Edit #2 from A" , modifier = modifier)
    Text(text = "new Edit #2 from B" , modifier = modifier)
    Text(text = "new Edit #2 from A" , modifier = modifier)
    Text(text = "new Edit #2 from B" , modifier = modifier)
    Text(text = "new Edit #3 from B" , modifier = modifier)
    Text(text = "new Edit #3 from B" , modifier = modifier)
}