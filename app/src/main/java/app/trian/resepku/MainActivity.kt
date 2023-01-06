package app.trian.resepku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.base.extensions.listenRouteChanges
import dagger.hilt.android.AndroidEntryPoint

//sbshds
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

            }
        }
    }
}