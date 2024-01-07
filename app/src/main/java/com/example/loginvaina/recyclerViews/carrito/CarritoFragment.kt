package com.example.loginvaina.recyclerViews.carrito

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginvaina.R
import com.example.loginvaina.databinding.FragmentCarritoBinding
import com.example.loginvaina.recyclerViews.carrito.adapter.CarritoAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class CarritoFragment : Fragment() {

    private lateinit var binding : FragmentCarritoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.visibility = View.VISIBLE
        binding = FragmentCarritoBinding.inflate(inflater)
        initRecyclerView()

        return binding.root

    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this.context)
        val decoration = DividerItemDecoration(this.context, manager.orientation)
        binding.recyclerViewCafeteria.layoutManager = manager
        binding.recyclerViewCafeteria.adapter = CarritoAdapter(CarritoProvider.carritoList)

        binding.recyclerViewCafeteria.addItemDecoration(decoration)}
}