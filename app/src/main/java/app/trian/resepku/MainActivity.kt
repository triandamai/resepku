/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.base.extensions.listenRouteChanges
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state = rememberApplicationState()
            state.listenRouteChanges()

            BaseMainApp(
                appState = state
            ){
                AppNavigation(it)
            }
        }
    }
}