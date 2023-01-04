package app.trian.resepku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.base.extensions.listenRouteChanges
import app.trian.resepku.ui.theme.ResepkuTheme
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

            }
        }
    }
}