package com.example.loginvaina.recyclerViews.menjar.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.recyclerViews.menjar.Menjar

class MenjarAdapter(val menjarList:List<Menjar>) : RecyclerView.Adapter<MenjarViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenjarViewHolder {
    }

    override fun getItemCount(): Int = menjarList.size

    override fun onBindViewHolder(holder: MenjarViewHolder, position: Int) {
    }
}