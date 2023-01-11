package app.trian.resepku.feature.createRecipe

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object CreateRecipe {
    const val routeName = "CreateRecipe"
}

fun NavGraphBuilder.routeCreateRecipe(
    appState:ApplicationState
) {
    composable(CreateRecipe.routeName) {
        val viewModel = hiltViewModel<CreateRecipeViewModel>()

        ScreenCreateRecipe()

    }
}