package com.example.loginvaina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.loginvaina.databinding.FragmentUsersBinding

class UsersFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    private lateinit var binding: FragmentUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUsersBinding.inflate(inflater)

        val share_model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        share_model.usuari.observe(viewLifecycleOwner, Observer {
            binding.usuari.text = it
        })

        share_model.contrasenya.observe(viewLifecycleOwner, Observer {
            binding.contrasenya.text = it
        })
        binding.secondContainer.setOnClickListener {
            viewModel.randomQuote()
            binding.usuari.text = viewModel.usuari
            binding.contrasenya.text = viewModel.contrasenya
        }

        return binding.root
    }


}