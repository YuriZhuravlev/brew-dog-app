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
        mBtnBeers.setOnClickListener { mPresenter.clickBtnAbout(MainMenuItem.BEERS) }
        mBtnFavorites.setOnClickListener { mPresenter.clickBtnAbout(MainMenuItem.FAVORITES) }
        mBtnFilters.setOnClickListener { mPresenter.clickBtnAbout(MainMenuItem.FILTERS) }
    }

    override fun clickBtnAbout() {

    }

    override fun clickBtnBeers() {
    }

    override fun clickBtnFavorites() {
    }

    override fun clickBtnFilters() {
    }

    override fun onAttach(item: MainMenuItem) {

    }
}