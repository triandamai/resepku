/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 23.21
*/
package app.trian.resepku.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells.Fixed
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.trian.filebox.R
import app.trian.filebox.R.drawable
import app.trian.resepku.base.BaseMainApp

@Composable
fun ItemGridRecipe() {
    val ctx = LocalContext.current
    val screenWidth = ctx
        .resources
        .displayMetrics.widthPixels.dp /
            LocalDensity.current.density

    val cardW = (screenWidth / 2) - 32.dp
    val cardH = cardW * 2

    Column(
        modifier = Modifier
            .width(cardW)
            .height(cardH),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(
                horizontal = 8.dp
            ),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.dummy_profile
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(cardW / 5)
                    .clip(RoundedCornerShape(2.dp)),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Calum Lewis",
                style = MaterialTheme.typography.displayMedium,
                fontSize = 12.sp
            )
        }
        Image(
            painter = painterResource(id = drawable.dummy_thumbnail),
            contentDescription = "",
            modifier = Modifier
                .size(cardW)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = Companion.Fit
        )
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Pancake",
                style = MaterialTheme.typography.titleMedium,
                fontSize = 17.sp
            )
            Row {
                Text(text = "Food")
                Text(text = "-")
                Text(text = ">60 mins")
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview
@Composable
fun PreviewItemGridRecipe() {
    BaseMainApp {
        LazyVerticalGrid(columns = Fixed(2), content = {
            items(5) {
                ItemGridRecipe()
            }
        })
    }

}