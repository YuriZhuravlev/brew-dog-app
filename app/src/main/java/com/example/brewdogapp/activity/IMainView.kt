package com.example.brewdogapp.activity

import com.example.brewdogapp.model.MainMenuItem
import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

@SingleState
interface IMainView : MvpView {
    fun clickBtnAbout(previousItem: MainMenuItem)
    fun clickBtnBeers(previousItem: MainMenuItem)
    fun clickBtnFavorites(previousItem: MainMenuItem)
    fun clickBtnFilters(previousItem: MainMenuItem)
    fun onResume(item: MainMenuItem)
}