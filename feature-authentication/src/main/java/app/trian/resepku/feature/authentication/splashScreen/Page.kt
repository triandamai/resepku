/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.authentication.splashScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.trian.core.ui.BaseScreen
import app.trian.core.ui.UIListener
import app.trian.core.ui.UIWrapper


@Composable
fun ScreenSplash(
    invoker: UIListener<SplashState, SplashEvent>
) = UIWrapper(invoker = invoker) {
    LaunchedEffect(key1 = this, block = {
        dispatch(SplashEvent.CheckSession)
    })
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {}
}


@Preview
@Composable
fun PreviewScreenSplash() {
    BaseScreen {
        ScreenSplash(
            invoker = UIListener(
                controller = it,
                state = SplashState()
            )
        )
    }
}