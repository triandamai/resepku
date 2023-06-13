/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.recipe.detailRecipe

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.core.view.WindowCompat
import app.trian.core.ui.BaseMainApp
import app.trian.core.ui.BaseScreen
import app.trian.core.ui.UIListenerData
import app.trian.core.ui.UiWrapperData
import app.trian.core.ui.component.R
import java.lang.Float.min

@Composable
fun ScreenDetailRecipe(
    uiEvent: UIListenerData<DetailRecipeState, DetailRecipeDataState, DetailRecipeEvent>
) = UiWrapperData(uiEvent) {
    val view = LocalView.current
    (view.context as? Activity)?.window?.let {
        WindowCompat.setDecorFitsSystemWindows(it, true)
    }
    val scrollState = rememberScrollState()
    val alpha by remember {
        derivedStateOf { min(1f, 1 - (scrollState.value / 600f)) }
    }
    val translateY by remember {
        derivedStateOf { -scrollState.value * 0.1f }
    }

//    val image =
//        rememberAsyncImagePainter(
//            model = ImageRequest
//                .Builder(LocalContext.current)
//                .data("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chorizo-mozarella-gnocchi-bake-cropped-9ab73a3.jpg?quality=90&webp=true&resize=600,545")
//                .crossfade(true)
//                .build()
//        )
    BaseScreen {
        Box {
            ConstraintLayout {
                Image(
                    painter = painterResource(id = app.trian.core.ui.component.R.drawable.dummy_recipe),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .graphicsLayer {
                            this.alpha = alpha
                            this.translationY = translateY
                        },
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(
                modifier = Modifier.verticalScroll(scrollState)
            ) {
                Box(modifier = Modifier.height(300.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(
                            RoundedCornerShape(
                                topStart = 12.dp,
                                topEnd = 12.dp
                            )
                        )
                        .background(MaterialTheme.colorScheme.surface),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(
                        modifier = Modifier
                            .width(50.dp)
                            .height(8.dp)
                            .clip(MaterialTheme.shapes.extraLarge)
                            .background(
                                Color.LightGray
                            )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Column {
                            Text(
                                text = "Caco Maca Walnut Milk",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = "Food . 60 Mins",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Normal
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                        }

                        Column {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.dummy_avatar_female),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(30.dp)
                                            .clip(CircleShape)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "Elena Shelby",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(30.dp)
                                            .clip(CircleShape)
                                            .background(MaterialTheme.colorScheme.primary)
                                            .padding(4.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Outlined.FavoriteBorder,
                                            contentDescription = "",
                                            modifier = Modifier
                                                .align(Alignment.Center)
                                                .padding(2.dp),
                                            tint = Color.LightGray
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "200 Likes",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Divider()
                            Spacer(modifier = Modifier.height(16.dp))
                        }

                        Column {
                            Text(
                                text = "Description",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = "Your recipe has been uploaded, you can see it on your profile. Your recipe has been uploaded, you can see it on your",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Normal
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Divider()
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        Column {
                            Text(
                                text = "Ingredients",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            for (i in 0..4) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(
                                            vertical = 2.dp
                                        ),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(30.dp)
                                            .clip(CircleShape)
                                            .background(MaterialTheme.colorScheme.surfaceVariant)
                                            .padding(4.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Outlined.Check,
                                            contentDescription = "",
                                            modifier = Modifier
                                                .align(Alignment.Center)
                                                .padding(2.dp),
                                            tint = MaterialTheme.colorScheme.primary
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "1/4 Butter",
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Divider()
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                        Column {
                            Text(
                                text = "Steps",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            for (i in 0..4) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(
                                            vertical = 8.dp
                                        ),
                                    verticalAlignment = Alignment.Top
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(30.dp)
                                            .clip(CircleShape)
                                            .background(MaterialTheme.colorScheme.primary)
                                            .padding(4.dp)
                                    ) {
                                        Text(
                                            text = "1",
                                            style = MaterialTheme.typography.bodySmall,
                                            fontWeight = FontWeight.Bold,
                                            modifier = Modifier
                                                .align(Alignment.Center)
                                                .padding(2.dp),
                                            color = MaterialTheme.colorScheme.surface
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(16.dp))
                                    Column {
                                        Text(
                                            text = "Your recipe has been uploaded, you can see it on your profile. Your recipe has been uploaded, you can see it on your",
                                            style = MaterialTheme.typography.bodySmall,
                                            fontWeight = FontWeight.SemiBold
                                        )
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Image(
                                            painter = painterResource(id = app.trian.core.ui.component.R.drawable.dummy_recipe),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .height(
                                                    150.dp
                                                )
                                                .clip(MaterialTheme.shapes.extraLarge),
                                            contentScale = ContentScale.FillBounds
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                        }


                    }


                }
            }
        }

    }
}

@Preview
@Composable
fun PreviewScreenDetailRecipe() {
    BaseMainApp {
        ScreenDetailRecipe(
            uiEvent = UIListenerData(
                controller = it,
                state = DetailRecipeState(),
                data = DetailRecipeDataState()
            )
        )
    }
}