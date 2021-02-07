package com.example.brewdogapp.fragments.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.brewdogapp.R
import moxy.MvpAppCompatFragment

class AboutFragment : MvpAppCompatFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_about, container, false)
        return v
    }
}