package app.trian.resepku.feature.createRecipe

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.trian.resepku.base.BaseMainApp
import app.trian.resepku.feature.createRecipe.components.AppBarStep
import app.trian.resepku.feature.createRecipe.components.BottomBarStep
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
internal fun ScreenCreateRecipe(
    modifier: Modifier = Modifier,
) {
    val pagerState = rememberPagerState(
        initialPage = 0
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        AppBarStep()
        HorizontalPager(
            count = 1,
            userScrollEnabled = false,
            state = pagerState
        ) { page ->
            AnimatedVisibility(
                visible = page == pagerState.currentPage,
                enter = slideInHorizontally(
                    initialOffsetX = { it }, // it == fullWidth
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearEasing
                    )
                ),
            ) {
                when(page){
                    0->{}
                    else->{}
                }
            }
        }
        BottomBarStep()
    }
}

@Preview
@Composable
fun PreviewScreenCreateRecipe() {
    BaseMainApp {
        ScreenCreateRecipe()
    }

}