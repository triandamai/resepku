/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.44
*/
package app.trian.resepku.feature.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.base.BaseMainApp

@Composable
internal fun ScreenHome(
    modifier: Modifier = Modifier,
) {

    LazyColumn(content = {
        item {
            TabRow(selectedTabIndex = 0) {

            }
        }

    })
}

@Preview
@Composable
fun PreviewScreenHome() {
    BaseMainApp {
        ScreenHome()
    }

}