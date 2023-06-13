/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.recipe.detailRecipe

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import javax.annotation.concurrent.Immutable

@Immutable
@Parcelize
data class DetailRecipeState(
    val a: String = ""
) : Parcelable

@Immutable
@Parcelize
data class DetailRecipeDataState(
    val a: String = ""
) : Parcelable

sealed interface DetailRecipeEvent {
}