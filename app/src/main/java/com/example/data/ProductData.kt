package com.example.data

import com.example.R

class ProductData {

    fun allProducts(): List<FoodItem> {

        return listOf(
            FoodItem("TOFU", "Tofu Scramble", 90.99, "Delicious"),
            FoodItem(
                "Asdf83ka8j",
                "Vegan Breakfast Platter",
                4.99,
                "Really delicious",
                R.drawable.fresh_salad,
                true
            ),
            FoodItem("A!", "Vegan Nom Burrito", 8.99, "Delicious"),
            FoodItem("12378", "Tofu Scramble", 1.23, "Delicious"),
            FoodItem("SCRAMBLE", "Tofu Scramble", 4.99, "Delicious"),
            FoodItem("asdf1234", "Btn Star", 67.99, "Delicious", android.R.drawable.btn_star, true),
            FoodItem("b", "Tofu Scramble", 23.23, "Delicious")
        )
    }
}
