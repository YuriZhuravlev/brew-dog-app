package com.example.brewdogapp.fragments.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.brewdogapp.R
import com.example.brewdogapp.model.Beer

class BeerListAdapter(list: List<Beer>) : RecyclerView.Adapter<BeerViewHolder>() {
    private val mList = list.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_beer, parent, false)
        return BeerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeerViewHolder, position: Int) {
        holder.title.text = mList[position].name
        holder.text.text = mList[position].description
        holder.alcohol.text = mList[position].abv.toString()
        holder.date.text = mList[position].firstBrewed
    }

    override fun getItemCount() = mList.size
}