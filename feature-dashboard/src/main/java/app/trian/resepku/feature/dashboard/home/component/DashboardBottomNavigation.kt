/*
 * Copyright (c) 2023 trian.app. 
 */

package app.trian.resepku.feature.dashboard.home.component

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import app.trian.core.ui.BaseMainApp
import app.trian.core.ui.BaseScreen

sealed class DashboardBottomNavigationMenu(
    val iconActive: Int,
    val iconInActive: Int,
    val title: String
) {
    object Home : DashboardBottomNavigationMenu(
        app.trian.core.ui.component.R.drawable.nav_home_active,
        app.trian.core.ui.component.R.drawable.nav_home_inactive,
        "Home"
    )

    object Explore : DashboardBottomNavigationMenu(
        app.trian.core.ui.component.R.drawable.nav_report_active,
        app.trian.core.ui.component.R.drawable.nav_report_inactive,
        "Explore"
    )

    object Profile : DashboardBottomNavigationMenu(
        app.trian.core.ui.component.R.drawable.nav_community_active,
        app.trian.core.ui.component.R.drawable.nav_community_inactive,
        "Profile"
    )


}

@Composable
fun DashboardBottomNavigation(
    selectedMenu: Int? = null,
    onClick: (Int) -> Unit = {}
) {
    val menu = listOf(
        DashboardBottomNavigationMenu.Home,
        DashboardBottomNavigationMenu.Explore,
        DashboardBottomNavigationMenu.Profile,
    )
    NavigationBar {
        menu.forEachIndexed { index, menu ->
            NavigationBarItem(
                selected = selectedMenu == index,
                onClick = {
                    onClick(index)
                },
                icon = {
                    Icon(
                        painter = painterResource(
                            id = if (selectedMenu == index) menu.iconActive else menu.iconInActive
                        ),
                        contentDescription = "",
                        tint = if (selectedMenu == index) MaterialTheme.colorScheme.primary else Color.DarkGray
                    )
                }
            )
        }

    }
}

@Preview
@Composable
fun PreviewDashboardBottomNavigation() {
    BaseMainApp {
        BaseScreen(
            bottomBar = {
                DashboardBottomNavigation(

                )
            }
        ) {

        }
    }
}