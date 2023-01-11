package app.trian.resepku.feature.createRecipe

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.feature.createRecipe.components.AppBarStep
import app.trian.resepku.feature.createRecipe.components.BottomBarStep

@Composable
internal fun ScreenCreateRecipe(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        AppBarStep()
        LazyColumn(
            modifier = Modifier.fillMaxHeight(fraction = 0.8f),
            content = {

            }
        )
        BottomBarStep()
    }
}

@Preview
@Composable
fun PreviewScreenCreateRecipe() {
    BaseMainApp {
        ScreenCreateRecipe()
    }

}