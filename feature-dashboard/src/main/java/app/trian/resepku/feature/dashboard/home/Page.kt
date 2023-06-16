/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.dashboard.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import app.trian.core.annotation.Navigation
import app.trian.core.ui.BaseMainApp
import app.trian.core.ui.BaseScreen
import app.trian.core.ui.UIListenerData
import app.trian.core.ui.UIWrapper
import app.trian.core.ui.routes.Routes
import app.trian.resepku.feature.dashboard.home.component.DashboardBottomNavigation
import app.trian.resepku.feature.dashboard.home.component.HomeScreen


@Navigation(
    route = Routes.Home.routeName,
    viewModel = HomeViewModel::class
)
@Composable
fun ScreenHome(
    uiEvent: UIListenerData<HomeState, HomeDataState, HomeEvent>
) = UIWrapper(uiEvent = uiEvent) {

    BaseScreen(
        bottomBar = {
            DashboardBottomNavigation(
                selectedMenu = state.currentPage,
                onClick = {
                    commit { copy(currentPage = it) }
                }
            )
        }
    ) {
        when (state.currentPage) {
            0 -> HomeScreen(
                onItemRecipeClick = {
                    router.navigate(Routes.DetailRecipe.routeName, "INI ID")
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewScreenOnboard() {
    var state by remember {
        mutableStateOf(HomeState())
    }
    BaseMainApp {
        ScreenHome(
            uiEvent = UIListenerData(
                controller = it,
                state = state,
                data = HomeDataState(),
                commit = {
                    state = it
                }
            )
        )
    }
}