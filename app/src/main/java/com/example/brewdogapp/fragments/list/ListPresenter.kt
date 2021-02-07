package com.example.brewdogapp.fragments.list

import com.example.brewdogapp.storage.net.getApiService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class ListPresenter : MvpPresenter<IListView>() {
    fun initList() {
        getApiService().getAllBeers(1)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                viewState.initRecyclerView(it)
            }, {
                viewState.error(it.message)
            })
    }
}