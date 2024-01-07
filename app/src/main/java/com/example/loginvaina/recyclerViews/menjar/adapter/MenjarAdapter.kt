package com.example.loginvaina.recyclerViews.menjar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.R
import com.example.loginvaina.recyclerViews.beguda.adapter.BegudaViewHolder
import com.example.loginvaina.recyclerViews.menjar.Menjar

class MenjarAdapter(private val menjarList:List<Menjar>) : RecyclerView.Adapter<MenjarViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenjarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MenjarViewHolder(layoutInflater.inflate(R.layout.fragment_menjar, parent, false))
    }

    override fun getItemCount(): Int = menjarList.size

    override fun onBindViewHolder(holder: MenjarViewHolder, position: Int) {
        val item = menjarList[position]
        holder.render(item)
    }
}