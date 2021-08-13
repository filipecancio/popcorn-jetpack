package dev.cancio.popcorn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.popcorn.model.movies
import dev.cancio.popcorn.ui.components.atom.BottomBar
import dev.cancio.popcorn.ui.components.atom.MovieItem
import dev.cancio.popcorn.ui.components.atom.TopBar
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
    Scaffold(
        backgroundColor = MaterialTheme.colors.primarySurface,
        bottomBar = { BottomBar() },
        topBar = { TopBar()}
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp, 10.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            movies.forEach { MovieItem(it) }
        }
    }
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