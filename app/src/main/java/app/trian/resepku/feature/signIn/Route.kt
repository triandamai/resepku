/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.signIn

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState
import app.trian.resepku.components.DashboardBottomNavigationItem.Home

object SignIn {
    const val routeName = "SignIn"
}

fun NavGraphBuilder.routeSignIn(
    appState:ApplicationState,
) {
    composable(SignIn.routeName) {
        val viewModel = hiltViewModel<SignInViewModel>()

        ScreenSignIn(
            onSignInBasic = {
                email,password->
                appState.router.navigate(Home.route)
            },
            onSignInGoogle = {
                appState.router.navigate(Home.route)
            }
        )

    }
}