package com.example.loginvaina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.enaitzdam.appmvvmzero.HomeViewModel
import com.example.loginvaina.databinding.FragmentUsersBinding

class UsersFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    private lateinit var binding: FragmentUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUsersBinding.inflate(inflater)

        binding.secondContainer.setOnClickListener {
            viewModel.randomQuote()
            binding.usuari.text = viewModel.usuari
            binding.contrasenya.text = viewModel.contrasenya
        }

        return binding.root
    }


}