package com.freeperro.coderswag.featureSwag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import com.freeperro.coderswag.featureSwag.Model.Category
import com.freeperro.coderswag.featureSwag.R
import com.freeperro.coderswag.featureSwag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter <Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
