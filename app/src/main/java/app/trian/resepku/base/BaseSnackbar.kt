package app.trian.resepku.base

import androidx.compose.material.SnackbarHost
import androidx.compose.runtime.Composable
import app.trian.resepku.ApplicationState

@Composable
fun BaseSnackbar(
    applicationState: ApplicationState
) {
    with(applicationState) {
        SnackbarHost(hostState = snackbarHostState, snackbar = {
            when (snackBarType) {
                else -> {}
            }
        })
    }
}