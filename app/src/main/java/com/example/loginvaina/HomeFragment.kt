package com.example.loginvaina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.loginvaina.databinding.FragmentHomeBinding
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider

class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)

        binding.editTextText.addTextChangedListener{
            viewModel.actualitzarNomUsuari(it.toString())
        }

        binding.editTextTextPassword.addTextChangedListener{
            viewModel.actualitzarContrasenya(it.toString())
        }

        binding.button.setOnClickListener{

            val share_model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

            if (viewModel.iniciarSessio(viewModel.nombreUsuario.value.toString(),
                viewModel.contrasenia.value.toString())
            ) {
                share_model.dades(viewModel.nombreUsuario.value.toString(), viewModel.contrasenia.value.toString())
                findNavController().navigate(R.id.action_homeFragment_to_usersFragment)

            }
        }

        return binding.root
    }

}