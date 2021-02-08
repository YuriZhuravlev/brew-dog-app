package com.example.brewdogapp.activity

import com.example.brewdogapp.model.MainMenuItem
import moxy.InjectViewState
import moxy.MvpPresenter
import java.util.*

@InjectViewState
class MainPresenter : MvpPresenter<IMainView>() {
    private val mItemStack = Stack<MainMenuItem>()

    fun clickBtnAbout() {
        viewState.clickBtnAbout(mItemStack.peek())
        mItemStack.add(MainMenuItem.ABOUT)
    }

    fun clickBtnBeers() {
        viewState.clickBtnBeers(mItemStack.peek())
        mItemStack.add(MainMenuItem.BEERS)
    }

    fun clickBtnFavorites() {
        viewState.clickBtnFavorites(mItemStack.peek())
        mItemStack.add(MainMenuItem.FAVORITES)
    }

    fun clickBtnFilters() {
        viewState.clickBtnFilters(mItemStack.peek())
        mItemStack.add(MainMenuItem.FILTERS)
    }

    fun resume() {
        mItemStack.add(MainMenuItem.BEERS)
        viewState.onResume(mItemStack.peek())
    }

    fun backPressed() {
        viewState.backPressed(mItemStack.pop(), mItemStack.peek())
    }
}