package dev.cancio.popcorn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.cancio.popcorn.ui.theme.PopcornTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PopcornTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage() {
    Text(text = "Main Page")
}

@Composable
fun DetailPage() {
    Text(text = "Detail Page")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PopcornTheme {
        Surface(color = MaterialTheme.colors.background) {
            MainPage()
        }
    }
}