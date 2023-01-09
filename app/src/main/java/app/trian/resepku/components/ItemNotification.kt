package app.trian.resepku.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.filebox.R
import app.trian.resepku.base.BaseMainApp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemNotification() {

    ListItem(
        leadingContent = {
            Image(
                painter = painterResource(id = R.drawable.dummy_thumbnail),
                contentDescription = "",
                modifier = Modifier.clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Fit
            )
        },
        headlineText = {
            Text(text = "Dean Winchester")
        },
        supportingText = {
            Text(text = "now following")
        }
    )
}

@Preview
@Composable
fun PreviewItemNotification() {
    BaseMainApp {
        LazyColumn(content = {
            items(10) {
                ItemNotification()
            }
        })
    }
}