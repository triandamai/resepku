/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import app.trian.resepku.feature.createRecipe.CreateRecipe
import app.trian.resepku.feature.createRecipe.routeCreateRecipe
import app.trian.resepku.feature.home.routeHome
import app.trian.resepku.feature.myRecipe.routeMyRecipe
import app.trian.resepku.feature.notification.routeNotification
import app.trian.resepku.feature.profile.routeProfile
import app.trian.resepku.feature.searchRecipe.routeSearchRecipe
import app.trian.resepku.feature.signIn.routeSignIn
import app.trian.resepku.feature.signUp.routeSignUp

@Composable
fun AppNavigation(
    applicationState: ApplicationState
) {
    NavHost(navController = applicationState.router, startDestination = CreateRecipe.routeName) {
        routeSignIn(applicationState)
        routeSignUp(applicationState)
        routeHome(applicationState)
        routeMyRecipe(applicationState)
        routeNotification(applicationState)
        routeProfile(applicationState)
        routeSearchRecipe(applicationState)
        routeCreateRecipe(applicationState)
    }
}