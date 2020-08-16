package com.example.data

class ProductData {

    fun allProducts(): List<FoodItem> {

        val foodItems = listOf(
            FoodItem("TOFU", "Tofu Scramble", 90.99, "Delicious"),
            FoodItem("Asdf83ka8j", "Vegan Breakfast Platter", 4.99, "Really delicious", true),
            FoodItem("A!", "Vegan Nom Burrito", 8.99, "Delicious"),
            FoodItem("12378", "Tofu Scramble", 1.23, "Delicious"),
            FoodItem("SCRAMBLE", "Tofu Scramble", 4.99, "Delicious"),
            FoodItem("asdf1234", "Tofu Scramble", 67.99, "Delicious", true),
            FoodItem("b", "Tofu Scramble", 23.23, "Delicious")
        )

        return foodItems
    }
}
