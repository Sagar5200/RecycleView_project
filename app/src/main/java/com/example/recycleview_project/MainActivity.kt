package com.example.recycleview_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL


        val adapter = HobbiesAdapter(this, Supplier.hobbies)

        val recycleView = findViewById<RecyclerView>(R.id.recycleView)

        recycleView.adapter = adapter

        recycleView.layoutManager = layoutManager
    }
}