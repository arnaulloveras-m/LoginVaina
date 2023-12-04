package com.enaitzdam.appmvvmzero

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginvaina.UserProvider

class HomeViewModel : ViewModel() {

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

    private var score = 0
    private var currentWordCount = 0

    // Declare private mutable variable that can only be modified
    // within the class it is declared.
    private var _count = 0

    // Declare another public immutable field and override its getter method.
    // Return the private property's value in the getter method.
    // When count is accessed, the get() function is called and
    // the value of _count is returned.
    val count: Int
        get() = _count

    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord

    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String
}