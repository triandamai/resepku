/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.43
*/
package app.trian.resepku.base

import androidx.compose.runtime.Composable
import app.trian.resepku.ApplicationState
import app.trian.resepku.components.DashboardBottomNavigation


@Composable
fun BaseBottomBar(
    applicationState: ApplicationState
) {

    with(applicationState) {
        when (bottomAppBarType) {
            DashboardBottomNavigation.bottomBarType -> {
                DashboardBottomNavigation(
                    onItemClick = {
                        router.navigate(it.route) {
                            launchSingleTop = true
                        }
                    }
                )
            }
            else -> {

            }
        }
    }

}