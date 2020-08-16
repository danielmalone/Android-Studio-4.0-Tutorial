package com.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.data.ProductData
import kotlinx.android.synthetic.main.product_info.*

class ProductInformationFragment : Fragment() {

    private val args: ProductInformationFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.product_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productCode = args.productCodeArgument

        val product = ProductData().allProducts().find { it.productCode == productCode }

        if (product != null) {
            productTitle.text = product.name
            productInfoDescription.text = product.description
        }
    }
}
