/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku.feature.notification

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import app.trian.resepku.ApplicationState

object Notification {
    const val routeName = "Notification"
}

fun NavGraphBuilder.routeNotification(
    appState: ApplicationState,
) {
    composable(Notification.routeName) {
        val viewModel = hiltViewModel<NotificationViewModel>()

        ScreenNotification()

    }
}