/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.dashboard.home

import android.os.Parcelable
import app.trian.resepku.feature.dashboard.home.component.DashboardBottomNavigationMenu
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import javax.annotation.concurrent.Immutable

@Immutable
@Parcelize
data class HomeState(
    val percentage:Float=01f,
    val currentPage:Int=0,
) : Parcelable

@Immutable
@Parcelize
data class HomeDataState(
    val percentage:Float=01f
) : Parcelable


sealed interface HomeEvent{
    data class PagerChanges(val page:Int=0): HomeEvent

}