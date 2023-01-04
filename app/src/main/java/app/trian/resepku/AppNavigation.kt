package app.trian.resepku

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import app.trian.resepku.feature.signIn.routeSignIn

@Composable
fun AppNavigation(
    applicationState: ApplicationState
) {
    NavHost(navController = applicationState.router, startDestination = ""){
        routeSignIn(
            applicationState
        )
    }
}