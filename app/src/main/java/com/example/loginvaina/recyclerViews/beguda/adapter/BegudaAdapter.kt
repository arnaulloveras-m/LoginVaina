package com.example.loginvaina.recyclerViews.beguda.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.R
import com.example.loginvaina.recyclerViews.beguda.Beguda

class BegudaAdapter(private val begudaList:List<Beguda>) : RecyclerView.Adapter<BegudaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BegudaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BegudaViewHolder(layoutInflater.inflate(R.layout.fragment_beguda, parent, false))
    }

    override fun getItemCount(): Int = begudaList.size

    override fun onBindViewHolder(holder: BegudaViewHolder, position: Int) {
        val item = begudaList[position]
        holder.render(item)
    }
}