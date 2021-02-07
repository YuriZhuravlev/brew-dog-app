package com.example.brewdogapp.fragments.list

import com.example.brewdogapp.model.Beer
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd
import moxy.viewstate.strategy.alias.SingleState

interface IListView : MvpView {
    @AddToEnd
    fun initRecyclerView(list: List<Beer>)

    @SingleState
    fun error(message: String?)
}
