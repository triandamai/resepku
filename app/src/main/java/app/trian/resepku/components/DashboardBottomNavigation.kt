/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.44
*/
package app.trian.resepku.components

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Doorbell
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.feature.home.Home.routeName as HomeRoute
import app.trian.resepku.feature.myRecipe.MyRecipe.routeName as MyRecipeRoute
import app.trian.resepku.feature.notification.Notification.routeName as NotificationRoute
import app.trian.resepku.feature.profile.Profile.routeName as ProfileRoute

object DashboardBottomNavigation {
    var bottomBarType = "DashboardBottomNavigationItem"
}

sealed class DashboardBottomNavigationItem(
    val name: String = "",
    val icon: ImageVector = Icons.Default.Home,
    val route: String = ""
) {
    object Home : DashboardBottomNavigationItem(
        name = "Home",
        icon = Icons.Outlined.Home,
        route = HomeRoute
    )

    object MyRecipe : DashboardBottomNavigationItem(
        name = "Resep",
        icon = Icons.Outlined.Edit,
        route = MyRecipeRoute
    )

    object Notification : DashboardBottomNavigationItem(
        name = "Notification",
        icon = Icons.Outlined.Doorbell,
        route = NotificationRoute
    )

    object Profile : DashboardBottomNavigationItem(
        name = "Profile",
        icon = Icons.Outlined.Person,
        route = ProfileRoute
    )
}

@Composable
fun DashboardBottomNavigation(
    items: List<DashboardBottomNavigationItem> = listOf(
        DashboardBottomNavigationItem.Home,
        DashboardBottomNavigationItem.MyRecipe,
        DashboardBottomNavigationItem.Notification,
        DashboardBottomNavigationItem.Profile,
    ),
    onItemClick: (DashboardBottomNavigationItem) -> Unit = {}
) {
    NavigationBar {
        items.forEach {
            NavigationBarItem(
                selected = false,
                onClick = { onItemClick(it) },
                icon = {
                    Icon(imageVector = it.icon, contentDescription = "")
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewDashboardBottomNavigation() {
    BaseMainApp(
        bottomBar = {
            DashboardBottomNavigation(

            )
        }
    )
}