package com.example.loginvaina.recyclerViews.beguda.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.loginvaina.databinding.FragmentBegudaBinding
import com.example.loginvaina.recyclerViews.beguda.Beguda
import com.example.loginvaina.recyclerViews.carrito.Carrito
import com.example.loginvaina.recyclerViews.carrito.CarritoProvider

class BegudaViewHolder (view:View) :RecyclerView.ViewHolder(view){

    val binding = FragmentBegudaBinding.bind(view)

    val llista = CarritoProvider.carritoList.toMutableList()

    val nouCarrito = (Carrito(
        binding.tvBegudaName.text.toString(),
        binding.tvBegudaPreu.toString(),
        binding.tvBegudaDescripcio.toString(),
        "1",
        binding.ivBeguda.toString()
    ))
    fun render(begudaModel: Beguda){

        binding.tvBegudaName.text = begudaModel.beguda
        binding.tvBegudaPreu.text = begudaModel.preu
        binding.tvBegudaDescripcio.text = begudaModel.descripcio
        Glide.with(binding.ivBeguda.context).load(begudaModel.photo).into(binding.ivBeguda)
        binding.ButoPerAfegir.setOnClickListener{Toast.makeText(binding.ivBeguda.context, "Afegit al carrito", Toast.LENGTH_SHORT).show()
        CarritoProvider.carritoList.toMutableList().add(nouCarrito)
            println(CarritoProvider.carritoList.toMutableList())
        }

    }
}