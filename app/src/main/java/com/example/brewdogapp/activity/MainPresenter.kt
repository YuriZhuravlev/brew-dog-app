package com.example.brewdogapp.activity

import com.example.brewdogapp.model.MainMenuItem
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<IMainView>() {
    var currentItem = MainMenuItem.BEERS

    fun clickBtnAbout(item: MainMenuItem) {
        viewState.clickBtnAbout()
    }

    fun clickBtnBeers(item: MainMenuItem) {
        viewState.clickBtnBeers()
    }

    fun clickBtnFavorites(item: MainMenuItem) {
        viewState.clickBtnFavorites()
    }

    fun clickBtnFilters(item: MainMenuItem) {
        viewState.clickBtnFilters()
    }

    fun attach() {
        viewState.onAttach(currentItem)
    }
}