package com.example.data

import com.example.R

data class FoodItem(
    val productCode: String,
    val name: String,
    val price: Double,
    val description: String,
    val photo: Int = R.drawable.fresh_salad,
    val isHighlyRated: Boolean = false
)
