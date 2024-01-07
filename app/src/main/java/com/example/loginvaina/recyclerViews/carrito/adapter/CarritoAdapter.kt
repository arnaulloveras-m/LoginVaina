package com.example.loginvaina.recyclerViews.carrito.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.R
import com.example.loginvaina.recyclerViews.carrito.Carrito

class CarritoAdapter(private val carritoList:List<Carrito>) : RecyclerView.Adapter<CarritoViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarritoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CarritoViewHolder(layoutInflater.inflate(R.layout.fragment_carrito, parent, false))
    }

    override fun getItemCount(): Int = carritoList.size

    override fun onBindViewHolder(holder: CarritoViewHolder, position: Int) {
        val item = carritoList[position]
        holder.render(item)
    }
}