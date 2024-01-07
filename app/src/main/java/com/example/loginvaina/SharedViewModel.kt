package com.example.loginvaina

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginvaina.recyclerViews.carrito.CarritoProvider
import com.example.loginvaina.user.UserModel
import com.example.loginvaina.user.UserProvider

class SharedViewModel :ViewModel() {
    val usuari = MutableLiveData<String>()
    val contrasenya = MutableLiveData<String>()
    val llista = CarritoProvider.carritoList.toMutableList()

    fun dades(user: String, contra: String) {
        usuari.postValue(user)
        contrasenya.postValue(contra)
    }

    private val llistaUsuaris = UserProvider.quotes.toMutableList() ?: mutableListOf()

    private var _llistaUsers = MutableLiveData<List<UserModel>>()
    val llistaUers: MutableLiveData<List<UserModel>>
        get() = _llistaUsers

    fun actualitzarLlista(novaLlista: List<UserModel>) {
        _llistaUsers.value = novaLlista
    }
}