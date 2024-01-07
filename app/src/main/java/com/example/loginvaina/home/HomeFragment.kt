package com.example.loginvaina.home

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
import com.example.loginvaina.R
import com.example.loginvaina.SharedViewModel
import com.example.loginvaina.user.UserModel
import com.example.loginvaina.user.UserProvider
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.math.log

class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    private val viewModel: HomeViewModel by viewModels()

    private var laLlista = UserProvider.quotes.toMutableList()

    private lateinit var sharedViewModel: SharedViewModel


    private fun iniciarSessio(usuari: String, contrasenila: String) :Boolean {
        var contador = 0
        while (contador < laLlista.size) {
            if (usuari == laLlista[contador].usuari &&
                contrasenila == laLlista[contador].contrasenya
            ) {
                println("${laLlista[contador].usuari}, ${laLlista[contador].contrasenya}")
                return true
            } else {
                println("${laLlista[contador].usuari}, ${laLlista[contador].contrasenya}")

                contador++
            }

        }
        return false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.visibility = View.GONE

        binding = FragmentHomeBinding.inflate(inflater)

        binding.editTextText.addTextChangedListener {
            viewModel.actualitzarNomUsuari(it.toString())
        }

        binding.editTextTextPassword.addTextChangedListener {
            viewModel.actualitzarContrasenya(it.toString())
        }

        binding.button.setOnClickListener {
            println(UserProvider.quotes.toMutableList())
            println(laLlista)

            val share_model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

            share_model.dades(
                viewModel.nombreUsuario.value.toString(),
                viewModel.contrasenia.value.toString()
            )

            iniciarSessio(viewModel.nombreUsuario.value.toString(), viewModel.contrasenia.value.toString())
            if (iniciarSessio(viewModel.nombreUsuario.value.toString(), viewModel.contrasenia.value.toString())) {

                findNavController().navigate(R.id.action_homeFragment_to_bebidaFragment)
            }

        }

        binding.buttonRegistre.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_registreFragment)
        }

        return binding.root
    }

}
