/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.recipe.createRecipe

import android.content.Context
import app.trian.core.ui.extensions.Empty
import app.trian.core.ui.extensions.add
import app.trian.core.ui.extensions.createUUID
import app.trian.core.ui.extensions.findIndex
import app.trian.core.ui.viewModel.BaseViewModelData
import app.trian.resepku.data.model.CookingStep
import app.trian.resepku.data.model.Ingredient
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class CreateRecipeViewModel @Inject constructor(
    @ApplicationContext context: Context
) : BaseViewModelData<CreateRecipeState, CreateRecipeDataState, CreateRecipeEvent>(
    context,
    CreateRecipeState(),
    CreateRecipeDataState()
) {
    private val totalStep = 4

    init {
        handleActions()
    }

    //page
    private fun calculatePage(
        isNext: Boolean
    ) = asyncWithState {
        //go to next screen
        if (isNext) {
            val gotToNextPage = if (step < totalStep) step.plus(1) else step
            commit {
                copy(step = gotToNextPage, visibleBottomBar = gotToNextPage != 3)
            }
            return@asyncWithState
        }

        //close when success screen
        if (step == 3) {
            navigation.navigateUp()
            return@asyncWithState
        }

        //confirmation when at the beginning screen
        if (step == 0) {
            bottomSheet.showBottomSheet(true)
            return@asyncWithState
        }

        //onBackPressed
        val goToPreviousPage = step - 1
        commit {
            copy(step = goToPreviousPage, visibleBottomBar = goToPreviousPage != 3)
        }
    }

    //cooking step
    private fun reorderCookingStep(from: Int, to: Int) = asyncWithState {
        if (from >= dataCookingStep.size || to >= dataCookingStep.size) return@asyncWithState
        val data = dataCookingStep.toMutableList().apply { add(to, removeAt(from)) }
        commit { copy(dataCookingStep = data) }
    }

    private fun addNewCookingStep() = asyncWithState {
        commit {
            copy(
                dataCookingStep = dataCookingStep.add(
                    CookingStep(
                        id = createUUID(),
                        value = String.Empty
                    )
                )
            )
        }
    }

    private fun changeCookingStep(
        data: CookingStep
    ) = asyncWithState {
        val findIndex = dataCookingStep.findIndex { (_, value) -> value.id == data.id }

        if (findIndex != -1) {
            val cookingSteps = dataCookingStep.toMutableList()
            cookingSteps[findIndex] = data
            commit { copy(dataCookingStep = cookingSteps) }
        }
    }

    private fun removeCookingStep(ingredientId: String) = asyncWithState {
        val findIndex = dataCookingStep.findIndex { (_, value) -> value.id == ingredientId }

        if (findIndex != -1) {
            val cookingSteps = dataCookingStep.toMutableList().apply {
                removeAt(findIndex)
            }
            commit { copy(dataCookingStep = cookingSteps) }
        }
    }

    //end

    //ingredient
    private fun reorderIngredient(from: Int, to: Int) = asyncWithState {
        if (from >= dataIngredient.size || to >= dataIngredient.size) return@asyncWithState
        val data = dataIngredient.toMutableList().apply { add(to, removeAt(from)) }
        commit { copy(dataIngredient = data) }
    }

    private fun addNewPlainIngredient() = asyncWithState {
        commit {
            copy(
                dataIngredient = dataIngredient.add(
                    Ingredient(
                        id = createUUID(),
                        value = String.Empty
                    )
                )
            )
        }
    }

    private fun changeIngredient(
        data: Ingredient
    ) = asyncWithState {
        val findIndex = dataIngredient.findIndex { (_, value) -> value.id == data.id }

        if (findIndex != -1) {
            val ingredients = dataIngredient.toMutableList()
            ingredients[findIndex] = data
            commit { copy(dataIngredient = ingredients) }
        }
    }

    private fun removeIngredient(ingredientId: String) = asyncWithState {
        val findIndex = dataIngredient.findIndex { (_, value) -> value.id == ingredientId }

        if (findIndex != -1) {
            val ingredients = dataIngredient.toMutableList().apply {
                removeAt(findIndex)
            }
            commit { copy(dataIngredient = ingredients) }
        }
    }
    //end


    override fun handleActions() = onEvent { event ->
        when (event) {
            is CreateRecipeEvent.ChangeStep -> calculatePage(event.isNextStep)
            CreateRecipeEvent.AddNewCookingStep -> addNewCookingStep()
            is CreateRecipeEvent.ReorderCookingStep -> reorderCookingStep(event.from, event.to)
            is CreateRecipeEvent.ChangeCookingStep -> changeCookingStep(event.data)
            is CreateRecipeEvent.RemoveCookingStep -> removeCookingStep(event.id)
            CreateRecipeEvent.AddNewIngredient -> addNewPlainIngredient()
            is CreateRecipeEvent.ReorderIngredient -> reorderIngredient(event.from, event.to)
            is CreateRecipeEvent.ChangeIngredient -> changeIngredient(event.data)
            is CreateRecipeEvent.RemoveIngredient -> removeIngredient(event.id)

        }
    }

}