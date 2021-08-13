package dev.cancio.popcorn.ui.components.atom

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Icon
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.cancio.popcorn.ui.theme.Green03
import dev.cancio.popcorn.ui.theme.Grey

@Preview(showBackground = true)
@Composable
fun TopBar(){
    TopAppBar(
        modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally),
        backgroundColor = Green03,
        contentColor = Grey,
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                "Meus Filmes"
            )
            Icon(
                Icons.Outlined.MoreVert,
                "more",
            )
        }
    }
}