package dev.cancio.popcorn.ui.components.atom

import android.icu.text.CaseMap
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.cancio.popcorn.ui.theme.Grey

private val example = Pair(
    "Cruella",
    "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella."
)

@Preview()
@Composable
fun AboutContent(
    title: String = example.first,
    content: String = example.second
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 20.dp)
    ) {
        Text(
            title,
            color = Grey,
            modifier = Modifier.padding(0.dp, 20.dp)
        )
        Text(
            content,
            color = Grey
        )
    }
}