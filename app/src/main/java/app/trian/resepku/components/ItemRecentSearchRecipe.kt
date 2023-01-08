package app.trian.resepku.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowOutward
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.base.BaseMainApp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemRecentSearchRecipe() {
    ListItem(
        leadingContent = {
            Icon(imageVector = Icons.Outlined.Schedule, contentDescription = "")
        },
        headlineText = {
            Text(text = "Pancakes")
        },
        trailingContent = {
            Icon(imageVector = Icons.Outlined.ArrowOutward, contentDescription = "")
        }
    )
}

@Preview
@Composable
fun PreviewItemRecentSearchRecipe() {
    BaseMainApp {
        LazyColumn(content = {
            items(3) {
                ItemRecentSearchRecipe()
            }
        })
    }
}