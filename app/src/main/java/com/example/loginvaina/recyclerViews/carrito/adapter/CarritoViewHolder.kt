package com.example.loginvaina.recyclerViews.carrito.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.loginvaina.databinding.FragmentCarritoBinding
import com.example.loginvaina.recyclerViews.carrito.Carrito

class CarritoViewHolder (view:View) :RecyclerView.ViewHolder(view){

    val binding = FragmentCarritoBinding.bind(view)

    fun render(carritoModel: Carrito){
        binding.tvCarritoName.text = carritoModel.nom
        binding.tvCarritoPreu.text = carritoModel.preu
        binding.tvCarritoDescripcio.text = carritoModel.descripcio
        binding.tvCarritoQuantitat.text = carritoModel.quantitat
        Glide.with(binding.ivCarrito.context).load(carritoModel.photo).into(binding.ivCarrito)
    }
}