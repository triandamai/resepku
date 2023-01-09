/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.notification


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.components.ItemNotification


@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun ScreenNotification(
    modifier: Modifier = Modifier,
) {
    val items = mapOf(
        "New" to listOf("a", "b", "c"),
        "Today" to listOf("a", "b"),
        "Yesterday" to listOf("a", "b", "c", "d", "e", "f")
    )
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 10.dp
        ),
        content = {
            item {
                Spacer(modifier = Modifier.height(30.dp))
            }
            items.forEach { (group, data) ->
                stickyHeader {
                    Column(
                        modifier = Modifier.padding(
                            horizontal = 8.dp
                        )
                    ) {
                        Text(
                            text = group,
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp
                        )
                    }
                }
                items(data) {
                    ItemNotification()
                }
            }
        })
}

@Preview
@Composable
fun PreviewScreenNotification() {
    BaseMainApp {
        ScreenNotification()
    }

}