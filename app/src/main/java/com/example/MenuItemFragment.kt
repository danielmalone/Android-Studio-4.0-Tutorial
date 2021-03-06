package com.example

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.data.ProductData
import kotlinx.android.synthetic.main.fragment_menu_item.*

class MenuItemFragment : Fragment() {

    private val args: MenuItemFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_menu_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productCode = args.productCodeArgument

        val product = ProductData().allProducts().find { it.productCode == productCode }

        if (product != null) {

            productTitle.text = product.name
            productInfoDescription.text = product.description
            productPhotoMain.setImageDrawable(
                ContextCompat.getDrawable(
                    requireActivity(),
                    product.photo
                )
            )

            addToCartButton.setOnClickListener {
                requireActivity().getSharedPreferences("shopping_cart", Context.MODE_PRIVATE).edit()
                    .apply {
                        putString("cart_amount", "twenty dollars")
                        putString("cart_tax", "twenty dollars")
                        putString("cart_quantity", "twenty dollars")
                        putString("cart_latest_item", product.name)
                    }.apply()
            }

        }

    }
}
