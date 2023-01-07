/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.43
*/
package app.trian.resepku.base.extensions

import app.trian.resepku.ApplicationState
import app.trian.resepku.components.DashboardBottomNavigation
import app.trian.resepku.components.DashboardBottomNavigationItem.Home
import app.trian.resepku.components.DashboardBottomNavigationItem.MyRecipe
import app.trian.resepku.components.DashboardBottomNavigationItem.Notification
import app.trian.resepku.components.DashboardBottomNavigationItem.Profile
import app.trian.resepku.components.HomeTopAppBar

//listen for route changes and re config layout
fun ApplicationState.listenRouteChanges() {
    with(this) {
        router.addOnDestinationChangedListener { _, destination, _ ->
            currentRoute = destination.route.orEmpty()
            when (currentRoute) {
                Home.route -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                    changeTopAppBar(HomeTopAppBar.appBarType)
                }
                MyRecipe.route -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                }
                Notification.route -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                    changeTopAppBar("")
                }
                Profile.route -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                }
                else -> {
                    if (bottomAppBarType.isNotBlank()) {
                        bottomAppBarType = ""
                    }
                    if (topAppBarType.isNotBlank()) {
                        topAppBarType = ""
                    }
                }
            }
        }
    }
}