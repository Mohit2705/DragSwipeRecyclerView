package com.example.mohsharma.dragswiperecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ItemAdapter : RecyclerView.Adapter<ItemViewHolder>(){

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView.text = "Item position is ${position + 1}"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 15
    }
}

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var textView: TextView = view.findViewById(R.id.text_view) as TextView
}
