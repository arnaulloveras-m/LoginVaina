package com.example.loginvaina.recyclerViews.beguda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginvaina.R
import com.example.loginvaina.databinding.FragmentBegudaBinding
import com.example.loginvaina.recyclerViews.beguda.adapter.BegudaAdapter
import com.example.loginvaina.recyclerViews.beguda.adapter.BegudaViewHolder
import com.google.android.material.bottomnavigation.BottomNavigationView

class BegudaFragment : Fragment() {

    private lateinit var binding : FragmentBegudaBinding

    private lateinit var begudaViewHolder: BegudaViewHolder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.visibility = View.VISIBLE
        binding = FragmentBegudaBinding.inflate(inflater)
        initRecyclerView()


        binding.ButoPerAfegir.setOnClickListener{
            Toast.makeText(binding.ivBeguda.context, "Afegit al carrito", Toast.LENGTH_SHORT).show()
            }

        return binding.root

    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this.context)
        val decoration = DividerItemDecoration(this.context, manager.orientation)
        binding.recyclerViewCafeteria.layoutManager = manager
        binding.recyclerViewCafeteria.adapter = BegudaAdapter(BegudaProvider.begudaList)

        binding.recyclerViewCafeteria.addItemDecoration(decoration)
    }

}