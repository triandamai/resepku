package app.trian.resepku.feature.createRecipe.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.resepku.base.BaseMainApp

@Composable
fun BottomBarStep(
    isFirstStep: Boolean = false
) {
    val ctx = LocalContext.current

    val screenWidth = ctx
        .resources
        .displayMetrics.widthPixels.dp /
            LocalDensity.current.density

    val cardW = (screenWidth / 2) - 10.dp
    BottomAppBar {
        if (isFirstStep) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { /*TODO*/ }) {
                Text(text = "Next")
            }
        } else {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    modifier = Modifier.width(cardW),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Back")
                }
                Button(
                    modifier = Modifier.width(cardW),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Next")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewBottomBarStepFalse() {
    BaseMainApp(
        bottomBar = {
            BottomBarStep(
                false
            )
        }
    )
}

@Preview
@Composable
fun PreviewBottomBarStepTrue() {
    BaseMainApp(
        bottomBar = {
            BottomBarStep(
                true
            )
        }
    )
}