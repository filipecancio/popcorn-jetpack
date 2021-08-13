package dev.cancio.popcorn.ui.components.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.popcorn.R
import dev.cancio.popcorn.model.Movie
import dev.cancio.popcorn.ui.theme.Green02
import dev.cancio.popcorn.ui.theme.Grey
import dev.cancio.popcorn.ui.theme.Yellow

val example = Movie(
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
fun MovieItem(movie: Movie = example) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(20.dp),
        backgroundColor = Green02,
        contentColor = Grey,
        modifier = Modifier
            .size(
                width = 376.dp,
                height = 160.dp
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .clip(RoundedCornerShape(20.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NetworkImage(
                url = movie.poster,
                contentDescription = movie.title,
                modifier = Modifier
                    .padding(10.dp)
                    .size(
                        width = 102.dp,
                        height = 138.dp
                    )
                    .clip(RoundedCornerShape(13.dp))
            )
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        movie.title,
                        color = Grey
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            Icons.Outlined.Star,
                            "star",
                            tint = Yellow
                        )
                        Text(
                            movie.voteAverage.toString(),
                            color = Yellow
                        )
                    }
                }
                Text(
                    "Graig Gillespie",
                    color = Grey
                )
            }
        }
    }
}