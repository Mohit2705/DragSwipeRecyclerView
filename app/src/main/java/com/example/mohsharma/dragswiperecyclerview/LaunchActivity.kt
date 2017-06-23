package com.example.mohsharma.dragswiperecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val recyclerView = findViewById(R.id.recycler_view) as RecyclerView
        val adapter = ItemAdapter()
        recyclerView.adapter = adapter

    }

}
