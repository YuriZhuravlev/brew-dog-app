package com.example.brewdogapp.activity

import com.example.brewdogapp.model.MainMenuItem
import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

@SingleState
interface IMainView : MvpView {
    fun clickBtnAbout()
    fun clickBtnBeers()
    fun clickBtnFavorites()
    fun clickBtnFilters()
    fun onAttach(item: MainMenuItem)
}