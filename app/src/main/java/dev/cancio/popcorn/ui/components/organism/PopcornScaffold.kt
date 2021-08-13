package dev.cancio.popcorn.ui.components.organism

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.cancio.popcorn.model.movies
import dev.cancio.popcorn.ui.components.atom.BottomBar
import dev.cancio.popcorn.ui.components.atom.MovieItem
import dev.cancio.popcorn.ui.components.atom.TopBar

@Composable
fun PopcornScafolld (
    content: @Composable () -> Unit
){
    Scaffold(
        backgroundColor = MaterialTheme.colors.primarySurface,
        bottomBar = { BottomBar() },
        topBar = { TopBar() },
        content = { content }
    )
}