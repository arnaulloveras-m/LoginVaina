package com.example.loginvaina.registre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.loginvaina.R
import com.example.loginvaina.SharedViewModel
import com.example.loginvaina.user.UserModel
import com.example.loginvaina.user.UserProvider
import com.example.loginvaina.databinding.FragmentRegistreBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class RegistreFragment : Fragment() {

    private lateinit var binding : FragmentRegistreBinding

    private val viewModel: RegistreViewModel by viewModels()

    private val sharedViewModel: SharedViewModel by viewModels()

    private val llistaUsuaris = UserProvider.quotes.toMutableList() ?: mutableListOf()

    fun compartirDades(novesDades: List<UserModel>): List<UserModel> {
        sharedViewModel.actualitzarLlista(novesDades)
        return novesDades
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistreBinding.inflate(inflater)

        val bottomNavigationView = requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.visibility = View.GONE

        binding.registreUsuari.addTextChangedListener{
            viewModel.actualitzarNomUsuari(it.toString())
        }

        binding.registreContrasenya.addTextChangedListener{
            viewModel.actualitzarContrasenya(it.toString())
        }

        val usuari = binding.registreUsuari.text.toString()

        fun ensenyarToast(missatge: String) {
            Toast.makeText(requireContext(), missatge, Toast.LENGTH_SHORT).show()
        }

        binding.buttoPerRegsitrarse.setOnClickListener {

            ensenyarToast("Funciona")
            if (viewModel.registre(viewModel.nombreUsuario.value.toString(), viewModel.contrasenia.value.toString())) {
                viewModel.registre(
                    viewModel.nombreUsuario.value.toString(),
                    viewModel.contrasenia.value.toString()
                )
                findNavController().navigate(R.id.action_registreFragment_to_homeFragment)
            }

            else
                ensenyarToast("Aquest usuari ja esta registrat")
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_registreFragment_to_homeFragment)
        }

        return binding.root
    }

}