package com.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.data.FoodItem
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }

        val foodItems = listOf(
            FoodItem("Tofu Scramble", 90.99, "Delicious"),
            FoodItem("Vegan Breakfast Platter", 4.99, "Delicious", true),
            FoodItem("Vegan Nom Burrito", 8.99, "Delicious"),
            FoodItem("Tofu Scramble", 1.23, "Delicious"),
            FoodItem("Tofu Scramble", 4.99, "Delicious"),
            FoodItem("Tofu Scramble", 67.99, "Delicious", true),
            FoodItem("Tofu Scramble", 23.23, "Delicious")
        )

        restaurantsRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RestaurantsAdapter(foodItems)
        }

    }
}
