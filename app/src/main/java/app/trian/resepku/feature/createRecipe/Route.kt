package app.trian.resepku.feature.createRecipe

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

object CreateRecipe {
    const val routeName = "CreateRecipe"
}

fun NavGraphBuilder.routeCreateRecipe(
    router: NavHostController,
) {
    composable(CreateRecipe.routeName) {
        val viewModel = hiltViewModel<CreateRecipeViewModel>()

        ScreenCreateRecipe()

    }
}