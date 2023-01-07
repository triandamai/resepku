/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.43
*/
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