package app.trian.resepku.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Outlined
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.ManageSearch
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp

object SearchRecipeTopAppBar{
    const val topAppBarType = "SearchRecipeTopAppBar"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchRecipeTopAppBar() {

    TopAppBar(
        navigationIcon = {
            Icon(imageVector = Outlined.ArrowBackIosNew, contentDescription = "")
        },
        title = {
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedTextField(
                value = "",
                readOnly = true,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Outlined.Search,
                        contentDescription = ""
                    )
                }, placeholder = {
                    Text(text = "Cari masakan enak")
                }, onValueChange = {})
            Spacer(modifier = Modifier.width(10.dp))
        },
        actions = {
            Icon(imageVector = Outlined.ManageSearch, contentDescription = "")
        }
    )
}

@Preview
@Composable
fun PreviewSearchTopAppBar() {
    BaseMainApp(
        topAppBar = {
            SearchRecipeTopAppBar()
        }
    )
}