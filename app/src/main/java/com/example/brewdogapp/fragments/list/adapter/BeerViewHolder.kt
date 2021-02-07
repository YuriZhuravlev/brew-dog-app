package com.example.brewdogapp.fragments.list.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.brewdogapp.R

class BeerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title = itemView.findViewById<TextView>(R.id.item_beer_title)
    val text = itemView.findViewById<TextView>(R.id.item_beer_text)
    val alcohol = itemView.findViewById<TextView>(R.id.item_beer_alcohol)
    val date = itemView.findViewById<TextView>(R.id.item_beer_date)
    val imageView = itemView.findViewById<ImageView>(R.id.item_beer_image)
}