package com.freeperro.coderswag.featureSwag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.freeperro.coderswag.featureSwag.Adapters.CategoryAdapter
import com.freeperro.coderswag.featureSwag.R
import com.freeperro.coderswag.featureSwag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
