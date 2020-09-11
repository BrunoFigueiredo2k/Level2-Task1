package com.example.level2_task1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.level2_task1.databinding.ActivityMainBinding
import com.example.level2_task1.databinding.ItemPlaceBinding
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter {



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemPlaceBinding.bind(itemView)

        fun bind(place: Place){
            binding.tvPlace.text = place.name
            binding.ivPlace.setImageResource(place.imageResId)
        }
    }
}