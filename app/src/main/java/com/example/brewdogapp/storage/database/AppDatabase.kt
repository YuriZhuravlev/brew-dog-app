package com.example.brewdogapp.storage.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.brewdogapp.model.Beer
import com.example.brewdogapp.storage.database.dao.BeerDao

@Database(entities = [Beer::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun beerDao(): BeerDao
}
