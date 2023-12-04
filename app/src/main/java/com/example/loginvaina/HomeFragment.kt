package com.example.loginvaina

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.loginvaina.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)


        binding.button.setOnClickListener{
            var contador = 0;
            while(contador < UserProvider.quotes.size){
                if (binding.editTextText.text.toString() == UserProvider.quotes[contador].usuari &&
                    binding.editTextTextPassword.text.toString() == UserProvider.quotes[contador].contrasenya) {
                    findNavController().navigate(R.id.action_homeFragment_to_usersFragment)
                    contador = UserProvider.quotes.size
                } else {
                    contador++;
                }
            }
        }

        return binding.root
    }

}