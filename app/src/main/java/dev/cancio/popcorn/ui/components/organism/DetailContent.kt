package dev.cancio.popcorn.ui.components.organism

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.cancio.popcorn.model.Movie
import dev.cancio.popcorn.ui.components.atom.AboutContent
import dev.cancio.popcorn.ui.components.atom.TopBanner

private val example = Movie(
    adult = false,
    backdropPath = "/jlGmlFOcfo8n5tURmhC7YVd4Iyy.jpg",
    genreIds = listOf(28, 12, 35, 878),
    id = 436969,
    originalLanguage = "en",
    originalTitle = "The Suicide Squad",
    overview = "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.",
    popularity = 5835.528,
    posterPath = "/kb4s0ML0iVZlG6wAKbbs9NAm6X.jpg",
    releaseDate = "2021-07-28",
    title = "The Suicide Squad",
    video = false,
    voteAverage = 8.1,
    voteCount = 1424
)

@Preview()
@Composable
fun DetailContent(movie: Movie = example){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TopBanner(
            movie.backdrop,
            movie.title
        )
        AboutContent(
            movie.title,
            movie.overview
        )
    }
}