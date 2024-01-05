package com.example.loginvaina.registre

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginvaina.user.UserModel
import com.example.loginvaina.user.UserProvider

class RegistreViewModel : ViewModel() {

    private val _nombreUsuario = MutableLiveData<String>()
    private val _contrasenia =  MutableLiveData<String>()

    private val llistaUsuaris = UserProvider.quotes.toMutableList() ?: mutableListOf()

    val nombreUsuario: LiveData<String>
        get() = _nombreUsuario
    val contrasenia: LiveData<String>
        get() = _contrasenia

    fun actualitzarNomUsuari(usuari: String) {
        _nombreUsuario.value = usuari
    }

    fun actualitzarContrasenya(contra: String) {
        _contrasenia.value = contra
    }


    fun registre(usuari: String, contrasenila: String): Boolean {

        var contador = 0
        while (contador < llistaUsuaris.size){
            if (usuari == llistaUsuaris[contador].usuari) {
                println(llistaUsuaris[contador])
                return false
            } else {
                contador++
            }
        }


        val nouUsuari = UserModel(usuari, contrasenila)

        llistaUsuaris.add(nouUsuari)

        llistaUsuaris.forEach{
            println("Usu: ${it.usuari}, cont: ${it.contrasenya}")
        }

        return true
    }


}