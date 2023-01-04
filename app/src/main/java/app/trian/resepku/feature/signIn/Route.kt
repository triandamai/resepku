package app.trian.resepku.feature.signIn

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object SignIn {
    const val routeName = "SignIn"
}

fun NavGraphBuilder.routeSignIn(
    appState:ApplicationState
) {
    composable(SignIn.routeName) {
        val viewModel = hiltViewModel<SignInViewModel>()

        ScreenSignIn()

    }
}