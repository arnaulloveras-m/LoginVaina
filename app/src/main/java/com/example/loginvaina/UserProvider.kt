package com.example.loginvaina

class UserProvider {

    companion object {
        fun random(): UserModel {
            val position = (0..4).random()
            return quotes[position]
        }

        val quotes = listOf(
            UserModel(
                usuari = "hola",
                contrasenya = "1234"
            ),
            UserModel(
                usuari = "adeu",
                contrasenya = "1234"
            ),
            UserModel(
                usuari = "Que tal",
                contrasenya = "1234"
            ),
            UserModel(
                usuari = "Como vamos",
                contrasenya = "4321"
            ),
            UserModel(
                usuari = "Si",
                contrasenya = "no"
            )
        )
    }
}