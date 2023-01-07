/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.43
*/
package app.trian.resepku.base

import androidx.compose.runtime.Composable
import app.trian.resepku.ApplicationState
import app.trian.resepku.components.HomeTopAppBar

@Composable
fun BaseTopAppBar(
    applicationState: ApplicationState
) {
    with(applicationState) {
        when (topAppBarType) {
            HomeTopAppBar.appBarType -> {
                HomeTopAppBar()
            }
            else -> {}
        }
    }
}