package app.trian.resepku.feature.searchRecipe

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.components.ItemRecentSearchRecipe
import com.google.accompanist.flowlayout.FlowRow

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun ScreenSearchRecipe(
    modifier: Modifier = Modifier,
) {
    val chips = listOf("sushi", "sandwich", "seafood", "fried rice","Kentucky","Ayam bakar madu")

    LazyColumn(content = {
        item {
            Column(
                modifier=Modifier.fillMaxWidth().height(10.dp)
                    .background(
                        MaterialTheme.colorScheme.surface
                    )
            ) {

            }
        }
        items(2) {
            ItemRecentSearchRecipe()
        }
        item {
            Column(
                modifier=Modifier.fillMaxWidth().height(10.dp)
                    .background(
                        MaterialTheme.colorScheme.surface
                    )
            ) {

            }
        }
        item {
            Column(
                modifier = Modifier.padding(
                    horizontal = 16.dp
                )
            ) {
                Text(
                    text = "Search suggestions",
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                FlowRow {
                    chips.forEach {
                        Chip(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.padding(
                                end = 10.dp
                            )
                        ) {
                            Text(text = it)
                        }
                    }
                }
            }
        }
    })
}

@Preview
@Composable
fun PreviewScreenSearchRecipe() {
    BaseMainApp {
        ScreenSearchRecipe()
    }

}