package dev.cancio.popcorn.ui.components.atom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.popcorn.R
import dev.cancio.popcorn.ui.theme.Green02
import dev.cancio.popcorn.ui.theme.Grey
import dev.cancio.popcorn.ui.theme.Yellow

@Preview(showBackground = true)
@Composable
fun MovieItem() {
    Row(
        modifier = Modifier
            .height(160.dp)
            .background(Green02),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.cruella),
            contentDescription = "cruella",
            modifier = Modifier
                .size(100.dp)
        )
        Column(
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                "Cruela",
                color = Grey
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Outlined.Star,
                    "star",
                )
                Text(
                    "8.9",
                    color = Yellow
                )
            }
            Text(
                "Graig Gillespie",
                color = Grey
            )
        }
    }
}