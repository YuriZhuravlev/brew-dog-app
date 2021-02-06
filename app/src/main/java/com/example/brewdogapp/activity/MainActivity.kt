package com.example.brewdogapp.activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import com.example.brewdogapp.R
import com.example.brewdogapp.model.MainMenuItem
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class MainActivity : MvpAppCompatActivity(), IMainView {
    @InjectPresenter
    lateinit var mPresenter: MainPresenter

    private lateinit var mBtnAbout: Button
    private lateinit var mBtnBeers: Button
    private lateinit var mBtnFavorites: Button
    private lateinit var mBtnFilters: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnAbout = findViewById(R.id.activity_main_btn_about)
        mBtnBeers = findViewById(R.id.activity_main_btn_beers)
        mBtnFavorites = findViewById(R.id.activity_main_btn_favorites)
        mBtnFilters = findViewById(R.id.activity_main_btn_filters)
        val toolbar: Toolbar? = findViewById(R.id.main_toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onResume() {
        super.onResume()
        mBtnAbout.setOnClickListener { mPresenter.clickBtnAbout(MainMenuItem.ABOUT) }
        mBtnBeers.setOnClickListener { mPresenter.clickBtnBeers(MainMenuItem.BEERS) }
        mBtnFavorites.setOnClickListener { mPresenter.clickBtnFavorites(MainMenuItem.FAVORITES) }
        mBtnFilters.setOnClickListener { mPresenter.clickBtnFilters(MainMenuItem.FILTERS) }
        mPresenter.resume()
    }

    override fun clickBtnAbout(previousItem: MainMenuItem) {
        if (previousItem != MainMenuItem.ABOUT) {
            getButton(previousItem).isEnabled = true
            mBtnAbout.isEnabled = false
        }
    }

    override fun clickBtnBeers(previousItem: MainMenuItem) {
        if (previousItem != MainMenuItem.BEERS) {
            getButton(previousItem).isEnabled = true
            mBtnBeers.isEnabled = false
        }
    }

    override fun clickBtnFavorites(previousItem: MainMenuItem) {
        if (previousItem != MainMenuItem.FAVORITES) {
            getButton(previousItem).isEnabled = true
            mBtnFavorites.isEnabled = false
        }
    }

    override fun clickBtnFilters(previousItem: MainMenuItem) {
        if (previousItem != MainMenuItem.FILTERS) {
            getButton(previousItem).isEnabled = true
            mBtnFilters.isEnabled = false
        }
    }

    override fun onResume(item: MainMenuItem) {
        getButton(item).isEnabled = false
    }

    private fun getButton(item: MainMenuItem): Button {
        return when (item) {
            MainMenuItem.BEERS -> mBtnBeers
            MainMenuItem.FILTERS -> mBtnFilters
            MainMenuItem.FAVORITES -> mBtnFavorites
            MainMenuItem.ABOUT -> mBtnAbout
        }
    }
}