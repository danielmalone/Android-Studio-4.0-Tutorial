package com.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.data.FoodItem
import kotlinx.android.synthetic.main.a_single_restaurant_row.view.*

class RestaurantsAdapter(private val foodItems: List<FoodItem>) :
    RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.a_single_restaurant_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = foodItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.bind(foodItem)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(foodItem: FoodItem) {
            itemView.foodItemTitle.text = foodItem.name
            itemView.foodPrice.text = "Price: $ ${foodItem.price}"
        }
    }
}
