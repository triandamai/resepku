/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.signUp

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object SignUp {
    const val routeName = "SignUp"
}

fun NavGraphBuilder.routeSignUp(
    appState: ApplicationState,
) {
    composable(SignUp.routeName) {
        val viewModel = hiltViewModel<SignUpViewModel>()

        ScreenSignUp(
            onSignUpBasic = {
                name, email, password ->
            },
            onSignUpGoogle = {}
        )

    }
}