/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.43
*/
package app.trian.resepku.base

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.ApplicationState
import app.trian.resepku.rememberApplicationState
import app.trian.resepku.ui.theme.ResepkuTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaseMainApp(
    appState: ApplicationState = rememberApplicationState(),
    topAppBar: @Composable (ApplicationState) -> Unit = { BaseTopAppBar(it) },
    bottomBar: @Composable (ApplicationState) -> Unit = { BaseBottomBar(it) },
    snackbarBar: @Composable (ApplicationState) -> Unit = { BaseSnackbar(it) },
    content: @Composable (appState: ApplicationState) -> Unit = { }
) {
    ResepkuTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
            Scaffold(
                topBar = {
                    topAppBar(appState)
                },
                bottomBar = {
                    bottomBar(appState)
                },
                snackbarHost = {
                    snackbarBar(appState)
                }
            ) {
                Column(
                    modifier = Modifier.padding(it)
                ) {
                    content(appState)
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewBaseMainApp() {
    BaseMainApp()
}