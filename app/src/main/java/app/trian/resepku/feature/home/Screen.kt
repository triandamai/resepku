/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.44
*/
package app.trian.resepku.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.components.ItemGridRecipe
import app.trian.resepku.composables.customTabIndicatorOffset

@Composable
internal fun ScreenHome(
    modifier: Modifier = Modifier,
) {
    val tabs = listOf("Minuman", "Makanan", "Vegetarian", "Sayuran", "Oseng", "Diet")
    Column {
        ScrollableTabRow(
            selectedTabIndex = 0,
            indicator = {
                TabRowDefaults.Indicator(
                    modifier = Modifier.customTabIndicatorOffset(
                        it[0],
                        8.dp
                    )
                )
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = 0 == index,
                    onClick = {

                    },
                    text = {
                        Text(
                            text = title,
                            maxLines = 1,
                            overflow = TextOverflow.Visible
                        )
                    }
                )
            }
        }
        LazyVerticalGrid(columns = Fixed(2), content = {
            item(span = {
                GridItemSpan(2)
            }) {
                Spacer(modifier = Modifier.height(10.dp))
            }
            items(10) {
                ItemGridRecipe()
            }
        })
    }
}

@Preview
@Composable
fun PreviewScreenHome() {
    BaseMainApp {
        ScreenHome()
    }

}