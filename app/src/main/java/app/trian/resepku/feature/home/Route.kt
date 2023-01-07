/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.44
*/
package app.trian.resepku.feature.home

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object Home {
    const val routeName = "Home"
}

fun NavGraphBuilder.routeHome(
    appState: ApplicationState,
) {
    composable(Home.routeName) {
        val viewModel = hiltViewModel<HomeViewModel>()

        ScreenHome()

    }
}