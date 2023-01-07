/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.myRecipe

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object MyRecipe {
    const val routeName = "MyRecipe"
}

fun NavGraphBuilder.routeMyRecipe(
    appState: ApplicationState,
) {
    composable(MyRecipe.routeName) {
        val viewModel = hiltViewModel<MyRecipeViewModel>()

        ScreenMyRecipe()

    }
}