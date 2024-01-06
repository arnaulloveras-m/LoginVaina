package com.example.loginvaina.recyclerViews.beguda.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.recyclerViews.beguda.Beguda

class BegudaAdapter(val begudaList:List<Beguda>) : RecyclerView.Adapter<BegudaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BegudaViewHolder {
    }

    override fun getItemCount(): Int = begudaList.size

    override fun onBindViewHolder(holder: BegudaViewHolder, position: Int) {
    }
}