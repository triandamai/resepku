package app.trian.resepku.feature.searchRecipe

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object SearchRecipe {
    const val routeName = "SearchRecipe"
}

fun NavGraphBuilder.routeSearchRecipe(
    appState:ApplicationState
) {
    composable(SearchRecipe.routeName) {
        val viewModel = hiltViewModel<SearchRecipeViewModel>()

        ScreenSearchRecipe()

    }
}