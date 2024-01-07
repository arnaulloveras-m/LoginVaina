package com.example.loginvaina.recyclerViews.menjar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginvaina.R
import com.example.loginvaina.databinding.FragmentBegudaBinding
import com.example.loginvaina.databinding.FragmentMenjarBinding
import com.example.loginvaina.recyclerViews.beguda.BegudaProvider
import com.example.loginvaina.recyclerViews.beguda.adapter.BegudaAdapter
import com.example.loginvaina.recyclerViews.menjar.adapter.MenjarAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenjarFragment : Fragment() {

    private lateinit var binding : FragmentMenjarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.visibility = View.VISIBLE
        binding = FragmentMenjarBinding.inflate(inflater)
        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView(){
        binding.recyclerViewCafeteria.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerViewCafeteria.adapter = MenjarAdapter(MenjarProvider.menjarList)
    }
}