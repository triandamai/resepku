package app.trian.resepku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.NavHost
import app.trian.core.ui.BaseMainApp
import app.trian.core.ui.UIController
import app.trian.core.ui.rememberUIController
import app.trian.core.ui.routes.Routes
import app.trian.ksp.authenticationComponent
import app.trian.ksp.dashboardComponent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var uiController: UIController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            uiController = rememberUIController()
            LaunchedEffect(key1 = uiController, block = {
                uiController.addOnEventListener { event, params ->
                    when (event) {
                        "EXIT" -> finish()
                    }
                }
            })
            BaseMainApp(
                controller = uiController
            ) {
                NavHost(
                    navController = it.router,
                    startDestination = Routes.Splash.routeName
                ) {
                    authenticationComponent(it)
                    dashboardComponent(it)
                    authenticationComponent(it)
                }
            }
        }
    }
}
