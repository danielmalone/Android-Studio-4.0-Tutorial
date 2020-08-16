package com.example.data

data class FoodItem(
    val productCode: String,
    val name: String,
    val price: Double,
    val description: String,
    val isHighlyRated: Boolean = false
)
