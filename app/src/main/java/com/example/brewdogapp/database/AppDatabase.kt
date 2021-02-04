package com.example.brewdogapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.brewdogapp.database.dao.BeerDao
import com.example.brewdogapp.model.Beer

@Database(entities = [Beer::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun beerDao(): BeerDao
}
