/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.profile

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object Profile {
    const val routeName = "Profile"
}

fun NavGraphBuilder.routeProfile(
    appState: ApplicationState,
) {
    composable(Profile.routeName) {
        val viewModel = hiltViewModel<ProfileViewModel>()

        ScreenProfile()

    }
}