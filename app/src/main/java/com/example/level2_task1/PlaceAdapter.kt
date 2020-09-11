package com.example.level2_task1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.level2_task1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter {



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Bind the image and name to the ImageView and TextView
        val binding = .bind(itemView)

        fun bind(place: Place){
            binding.tvPlace.text = place.name
            binding.ivPlace.setImageResource(place.imageResId)
        }
    }
}