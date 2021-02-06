package com.example.brewdogapp.activity

import com.example.brewdogapp.model.MainMenuItem
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<IMainView>() {
    var currentItem = MainMenuItem.BEERS

    fun clickBtnAbout(item: MainMenuItem) {
        viewState.clickBtnAbout(currentItem)
        currentItem = item
    }

    fun clickBtnBeers(item: MainMenuItem) {
        viewState.clickBtnBeers(currentItem)
        currentItem = item
    }

    fun clickBtnFavorites(item: MainMenuItem) {
        viewState.clickBtnFavorites(currentItem)
        currentItem = item
    }

    fun clickBtnFilters(item: MainMenuItem) {
        viewState.clickBtnFilters(currentItem)
        currentItem = item
    }

    fun resume() {
        viewState.onResume(currentItem)
    }
}