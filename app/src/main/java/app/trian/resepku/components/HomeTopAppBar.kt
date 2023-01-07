/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.44
*/
package app.trian.resepku.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons.Outlined
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp

object HomeTopAppBar{
    const val appBarType = "HomeAppBar"
}
@Composable
fun HomeTopAppBar() {

    TopAppBar(
        backgroundColor = MaterialTheme.colors.background,
        elevation = 0.dp,
        modifier = Modifier.padding(
            top = 8.dp
        ),
        title = {
            OutlinedTextField(
                value = "",
                readOnly=true,
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Outlined.Search,
                        contentDescription = ""
                    )
                }, placeholder = {
                    Text(text = "Cari masakan enak")
                }, onValueChange = {})
        }
    )
}

@Preview
@Composable
fun PreviewHomeTopAppBar() {
    BaseMainApp(
        topAppBar = {
            HomeTopAppBar()
        }
    )
}