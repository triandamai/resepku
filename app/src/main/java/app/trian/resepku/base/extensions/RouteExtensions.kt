/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.43
*/
package app.trian.resepku.base.extensions

import app.trian.resepku.ApplicationState
import app.trian.resepku.components.DashboardBottomNavigation
import app.trian.resepku.components.HomeTopAppBar
import app.trian.resepku.components.SearchRecipeTopAppBar
import app.trian.resepku.feature.home.Home
import app.trian.resepku.feature.myRecipe.MyRecipe
import app.trian.resepku.feature.notification.Notification
import app.trian.resepku.feature.profile.Profile
import app.trian.resepku.feature.searchRecipe.SearchRecipe

//listen for route changes and re config layout
fun ApplicationState.listenRouteChanges() {
    with(this) {
        router.addOnDestinationChangedListener { _, destination, _ ->
            currentRoute = destination.route.orEmpty()
            when (currentRoute) {
                Home.routeName -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                    changeTopAppBar(HomeTopAppBar.appBarType)
                }
                MyRecipe.routeName -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                }
                Notification.routeName -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                    changeTopAppBar("")
                }
                Profile.routeName -> {
                    changeBottomBar(DashboardBottomNavigation.bottomBarType)
                }
                SearchRecipe.routeName->{
                    changeBottomBar("")
                    changeTopAppBar(SearchRecipeTopAppBar.topAppBarType)
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