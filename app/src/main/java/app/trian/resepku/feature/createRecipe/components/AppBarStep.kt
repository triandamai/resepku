/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 11/01/23 18.03
*/
package app.trian.resepku.feature.createRecipe.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp


@Composable
fun AppBarStep() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(
            horizontal = 16.dp,
            vertical = 8.dp
        ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Cancel")
        Text(text = "1/2")
    }
}

@Preview
@Composable
fun PreviewAppBarStep() {
    BaseMainApp(
        topAppBar = {
            AppBarStep()
        }
    )
}