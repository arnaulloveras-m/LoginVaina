package com.example.loginvaina.recyclerViews.menjar.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.loginvaina.databinding.FragmentMenjarBinding
import com.example.loginvaina.recyclerViews.menjar.Menjar

class MenjarViewHolder (view:View) :RecyclerView.ViewHolder(view){

    val binding = FragmentMenjarBinding.bind(view)
    fun render(menjarModel: Menjar){
        binding.tvMenjarName.text = menjarModel.menjar
        binding.tvMenjarPreu.text = menjarModel.preu
        binding.tvMenjarDescripcio.text = menjarModel.descripcio
        Glide.with(binding.ivMenjar.context).load(menjarModel.photo).into(binding.ivMenjar)
        binding.ivMenjar.setOnClickListener{Toast.makeText(binding.ivMenjar.context, "Afegit al carrito", Toast.LENGTH_SHORT)}
    }
}