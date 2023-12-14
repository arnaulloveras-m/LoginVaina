package com.example.loginvaina

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginvaina.UserProvider.Companion.quotes

class SharedViewModel :ViewModel() {
    val usuari = MutableLiveData<String>()
    val contrasenya = MutableLiveData<String>()

    fun dades(user: String, contra: String) {
        usuari.postValue(user)
        contrasenya.postValue(contra)
    }
}