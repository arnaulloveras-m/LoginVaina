package com.example.loginvaina.recyclerViews.carrito.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.recyclerViews.carrito.Carrito

class CarritoAdapter(val carritoList:List<Carrito>) : RecyclerView.Adapter<CarritoViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarritoViewHolder {
    }

    override fun getItemCount(): Int = carritoList.size

    override fun onBindViewHolder(holder: CarritoViewHolder, position: Int) {
    }
}