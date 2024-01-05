package com.example.loginvaina.recyclerViews.beguda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginvaina.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BegudaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.visibility = View.VISIBLE
        return inflater.inflate(R.layout.fragment_beguda, container, false)


    }

}