package com.example.brewdogapp.storage

import com.example.brewdogapp.storage.database.dao.BeerDao
import com.example.brewdogapp.storage.net.getApiService

class Storage(beerDao: BeerDao) {
    private val mBeerDao = beerDao
    fun getBeers(page: Int = 1, function: Function<Any>) {
        getApiService().getAllBeers(page)
    }

    public interface StorageOwner {
        var obtainStorage: Storage
    }
}