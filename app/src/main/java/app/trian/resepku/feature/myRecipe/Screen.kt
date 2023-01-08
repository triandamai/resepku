/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.myRecipe

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.components.ItemGridRecipe

@Composable
internal fun ScreenMyRecipe(
    modifier: Modifier = Modifier,
) {
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

@Preview
@Composable
fun PreviewScreenMyRecipe() {
    BaseMainApp {
        ScreenMyRecipe()
    }

}