package com.example.brewdogapp.storage

import com.example.brewdogapp.model.Beer
import com.example.brewdogapp.storage.database.dao.BeerDao
import com.example.brewdogapp.storage.net.getApiService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class Storage(beerDao: BeerDao) {
    private val mBeerDao = beerDao

    fun getAllBeers(page: Int = 1, onSuccess: (List<Beer>) -> Unit, onError: (Throwable) -> Unit) {
        getApiService().getAllBeers(page)
            .request(onSuccess, onError)
    }

    fun getBeerById(id: Int, onSuccess: (List<Beer>) -> Unit, onError: (Throwable) -> Unit) {
        getApiService().getBeerById(id)
            .request(onSuccess, onError)
    }

    fun getBeersById(ids: String, onSuccess: (List<Beer>) -> Unit, onError: (Throwable) -> Unit) {
        getApiService().getBeersById(ids)
            .request(onSuccess, onError)
    }

    fun getBeerByFood(food: String, onSuccess: (List<Beer>) -> Unit, onError: (Throwable) -> Unit) {
        getApiService().getBeersByFood(food)
            .request(onSuccess, onError)
    }

    fun getBeerByName(name: String, onSuccess: (List<Beer>) -> Unit, onError: (Throwable) -> Unit) {
        getApiService().getBeersByName(name)
            .request(onSuccess, onError)
    }

    fun getBeerRandom(onSuccess: (List<Beer>) -> Unit, onError: (Throwable) -> Unit) {
        getApiService().getRandomBeer()
            .request(onSuccess, onError)
    }

    fun getBeers(
        page: Int,
        alcoholGreater: Int,
        alcoholLess: Int,
        bitternessGreater: Int,
        bitternessLess: Int,
        ebcGreater: Int,
        ebcLess: Int,
        dateBefore: String,
        dateAfter: String,
        onSuccess: (List<Beer>) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        getApiService().getBeers(
            page,
            alcoholGreater,
            alcoholLess,
            bitternessGreater,
            bitternessLess,
            ebcGreater,
            ebcLess,
            dateBefore,
            dateAfter
        )
            .request(onSuccess, onError)
    }

    public interface StorageOwner {
        var obtainStorage: Storage
    }
}

private fun <T> Single<T>.request(onSuccess: (T) -> Unit, onError: (Throwable) -> Unit) {
    this.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe({
            //TODO("Добавить обёртку для сохранения данных в db")
            onSuccess(it)
        }, {
            //TODO("Добавить обёртку для данных из db")
            onError(it)
        })
}
