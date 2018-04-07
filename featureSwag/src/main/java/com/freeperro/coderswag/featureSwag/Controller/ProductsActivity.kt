package com.freeperro.coderswag.featureSwag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.freeperro.coderswag.featureSwag.R
import com.freeperro.coderswag.featureSwag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
