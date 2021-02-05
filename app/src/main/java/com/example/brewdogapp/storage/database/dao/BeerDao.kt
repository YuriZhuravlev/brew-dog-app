package com.example.brewdogapp.storage.database.dao

import androidx.room.*
import com.example.brewdogapp.model.Beer
import io.reactivex.rxjava3.core.Completable

@Dao
interface BeerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBeer(beer: Beer): Completable

    @Update
    fun updateBeer(beer: Beer): Completable

    @Delete
    fun deleteBeer(beer: Beer): Completable
}