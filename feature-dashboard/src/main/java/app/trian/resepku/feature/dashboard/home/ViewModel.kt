/*
 * Copyright (c) 2023 trian.app.
 */

package app.trian.resepku.feature.dashboard.home

import android.content.Context
import app.trian.core.ui.viewModel.BaseViewModelData
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    @ApplicationContext context: Context
) : BaseViewModelData<HomeState, HomeDataState, HomeEvent>(
    context,
    HomeState(),
    HomeDataState()
) {
    init {
        handleActions()
    }

    private fun calculatePager(page: Int) = async {
        val percentage =  ((page.toFloat() / 3) * 100) / 100

    }

    override fun handleActions() = onEvent {
        when (it) {
            is HomeEvent.PagerChanges -> calculatePager(it.page)
        }
    }

}