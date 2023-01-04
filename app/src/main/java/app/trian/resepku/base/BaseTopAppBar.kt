package app.trian.resepku.base

import androidx.compose.runtime.Composable
import app.trian.resepku.ApplicationState

@Composable
fun BaseTopAppBar(
    applicationState: ApplicationState
) {
    with(applicationState) {
        when (topAppBarType) {
            else -> {}
        }
    }
}