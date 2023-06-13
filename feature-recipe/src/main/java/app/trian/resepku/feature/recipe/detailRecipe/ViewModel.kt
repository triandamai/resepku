/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.recipe.detailRecipe

import android.content.Context
import app.trian.core.ui.viewModel.BaseViewModelData
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class DetailRecipeViewModel @Inject constructor(
    @ApplicationContext context: Context
) : BaseViewModelData<DetailRecipeState, DetailRecipeDataState, DetailRecipeEvent>(
    context,
    DetailRecipeState(),
    DetailRecipeDataState()
) {
    init {
        handleActions()
    }

    override fun handleActions() = onEvent {}

}