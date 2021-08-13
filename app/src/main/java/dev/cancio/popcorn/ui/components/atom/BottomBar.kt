package dev.cancio.popcorn.ui.components.atom

import androidx.compose.foundation.background
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import dev.cancio.popcorn.ui.theme.Green03
import dev.cancio.popcorn.ui.theme.Grey

@Preview(showBackground = true)
@Composable
fun BottomBar() {
    val items = listOf(
        NavigationItem.Home
    )
    BottomAppBar(
        backgroundColor = Green03
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                unselectedContentColor = Grey,
                selectedContentColor = Grey,
                modifier = Modifier.background(Green03),
                icon = {
                    Icon(
                        item.icon,
                        item.title,
                    )
                },
                onClick = { },
                selected = true
            )
        }
    }
}

sealed class NavigationItem(
    var route: String,
    var icon: ImageVector,
    var title: String
) {
    object Home : NavigationItem("home", Icons.Outlined.Home, "Home")
}