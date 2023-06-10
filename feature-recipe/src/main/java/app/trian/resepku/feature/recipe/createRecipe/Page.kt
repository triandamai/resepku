/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.recipe.createRecipe

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.trian.core.ui.BaseMainApp
import app.trian.core.ui.BaseScreen
import app.trian.core.ui.UIListenerData
import app.trian.core.ui.UIWrapper
import app.trian.core.ui.component.ButtonPrimary
import app.trian.core.ui.component.ButtonSecondary
import app.trian.core.ui.component.HeaderStepWithProgress
import app.trian.core.ui.extensions.coloredShadow
import app.trian.resepku.feature.recipe.createRecipe.components.ScreenInputIngredient
import app.trian.resepku.feature.recipe.createRecipe.components.ScreenInputStep
import app.trian.resepku.feature.recipe.createRecipe.components.ScreenMain
import app.trian.resepku.feature.recipe.createRecipe.components.ScreenSuccessCreateRecipe

@OptIn(ExperimentalAnimationApi::class)
@Composable
internal fun ScreenCreateRecipe(
    state: CreateRecipeState = CreateRecipeState(),
    data: CreateRecipeDataState = CreateRecipeDataState(),
    invoker: UIListenerData<CreateRecipeState, CreateRecipeDataState, CreateRecipeEvent>
) = UIWrapper(invoker) {

    BackHandler {
        dispatch(
            CreateRecipeEvent.ChangeStep(
                isNext = false
            )
        )
    }

    BaseScreen(
        controller = invoker.controller,
        bottomSheet = {

        },
        bottomBar = {
            AnimatedVisibility(
                visible = state.visibleBottomBar,
                enter = slideInVertically(initialOffsetY = { it / 2 }),
                exit = slideOutVertically(targetOffsetY = { it / 2 })
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .coloredShadow(
                            color = MaterialTheme.colorScheme.primary,
                            alpha = 0.2f,
                            borderRadius = 20.dp
                        )
                        .clip(
                            RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 16.dp
                            )
                        )
                        .background(MaterialTheme.colorScheme.surface)
                        .padding(
                            vertical = 16.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ButtonSecondary(
                        text = "Kembali",
                        modifier = Modifier
                            .defaultMinSize(
                                minWidth = 150.dp
                            ),
                        fullWidth = false,
                        onClick = {
                            dispatch(
                                CreateRecipeEvent.ChangeStep(
                                    isNext = false
                                )
                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    ButtonPrimary(
                        text = "Lanjut",
                        modifier = Modifier
                            .defaultMinSize(
                                minWidth = 150.dp
                            ),
                        fullWidth = false,
                        enabled = true,
                        onClick = {
                            dispatch(
                                CreateRecipeEvent.ChangeStep(
                                    isNext = true
                                )
                            )
                        }
                    )

                }
            }
        },
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            if (state.step != 3) {
                HeaderStepWithProgress(
                    progress = (state.step + 1),
                    total = 3,
                    onClose = {
                        showBottomSheet()
                    },
                    onBackPress = {
                        dispatch(
                            CreateRecipeEvent.ChangeStep(
                                isNext = false
                            )
                        )
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            AnimatedContent(
                targetState = state.step,
                transitionSpec = {
                    fadeIn() with fadeOut()
                },
                label = ""
            ) {
                when (state.step) {
                    0 -> ScreenMain()


                    1 -> ScreenInputIngredient(
                        dataIngredient = state.dataIngredient,
                        onMove = { from, to ->
                            dispatch(
                                CreateRecipeEvent.ReorderIngredient(
                                    from = from,
                                    to = to
                                )
                            )
                        },
                        onChangeIngredient = {
                            dispatch(CreateRecipeEvent.ChangeIngredient(it))
                        },
                        onAddIngredient = {
                            dispatch(CreateRecipeEvent.AddNewIngredient)
                        },
                        onRemoveIngredient = {
                            dispatch(CreateRecipeEvent.RemoveIngredient(it.id))
                        }
                    )

                    2 -> ScreenInputStep(
                        dataCookingStep = state.dataCookingStep,
                        onMove = { from, to ->
                            dispatch(
                                CreateRecipeEvent.ReorderCookingStep(
                                    from = from,
                                    to = to
                                )
                            )
                        },
                        onChangeCookingStep = {
                            dispatch(CreateRecipeEvent.ChangeCookingStep(it))
                        },
                        onAddCookingStep = {
                            dispatch(CreateRecipeEvent.AddNewCookingStep)
                        },
                        onRemoveCookingStep = {
                            dispatch(CreateRecipeEvent.RemoveCookingStep(it.id))
                        }
                    )

                    3 -> ScreenSuccessCreateRecipe(
                        onClose = {
                            navigateUp()
                        },
                        onEdit = {

                        }
                    )

                    else -> Unit
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewScreenCreateRecipe() {
    BaseMainApp {
        ScreenCreateRecipe(
            invoker = UIListenerData(
                controller = it,
                state = CreateRecipeState(),
                data = CreateRecipeDataState()
            )
        )
    }
}