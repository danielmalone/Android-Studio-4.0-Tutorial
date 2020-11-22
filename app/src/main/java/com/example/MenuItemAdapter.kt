package com.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.data.FoodItem
import kotlinx.android.synthetic.main.menu_item_row.view.*

class MenuItemAdapter(private val foodItems: List<FoodItem>) :
    RecyclerView.Adapter<MenuItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_item_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = foodItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.bind(foodItem)
    }

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(foodItem: FoodItem) {
            itemView.foodItemTitle.text = foodItem.name
            itemView.foodPrice.text = "Price: $ ${foodItem.price}"

            if (foodItem.isHighlyRated) {
                itemView.highlyRatedIcon.visibility = View.VISIBLE
            }

            view.mainPhoto.setOnClickListener {
                val action = MainFragmentDirections.actionFirstFragmentToProductInfo(foodItem.productCode)
                view.findNavController().navigate(action)
            }
        }
    }
}
