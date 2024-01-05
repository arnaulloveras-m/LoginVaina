package com.example.loginvaina.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginvaina.user.UserProvider

class HomeViewModel : ViewModel() {

    private val _nombreUsuario = MutableLiveData<String>()
    private val _contrasenia =  MutableLiveData<String>()


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

    private val _dades = MutableLiveData<String>()

    val mevesDades: LiveData<String>
        get() = _dades

    private var _usuari = ""
    val usuari: String
        get() = _usuari

    private var _contrasenya = ""
    val contrasenya: String
        get() = _contrasenya

    fun randomQuote() {
        val currentQuote = UserProvider.random()
        _usuari=currentQuote.usuari
        _contrasenya=currentQuote.contrasenya
    }




}