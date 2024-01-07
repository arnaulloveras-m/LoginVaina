package com.example.loginvaina.recyclerViews.beguda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil.setContentView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginvaina.R
import com.example.loginvaina.databinding.FragmentBegudaBinding
import com.example.loginvaina.databinding.FragmentHomeBinding
import com.example.loginvaina.recyclerViews.beguda.adapter.BegudaAdapter
import com.example.loginvaina.recyclerViews.beguda.adapter.BegudaViewHolder
import com.example.loginvaina.recyclerViews.carrito.Carrito
import com.example.loginvaina.recyclerViews.carrito.CarritoProvider
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
        binding.recyclerViewCafeteria.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerViewCafeteria.adapter = BegudaAdapter(BegudaProvider.begudaList)
    }

}