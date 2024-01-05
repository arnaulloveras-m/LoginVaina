package com.example.loginvaina.recyclerViews.carrito

import com.example.loginvaina.recyclerViews.beguda.Beguda
import com.example.loginvaina.recyclerViews.menjar.Menjar

class CarritoProvider {
    companion object{
        val carritoList = listOf<Carrito>(
            Carrito(
                "CocaCola Zero",
                "1.99€",
                "Zero que sino me da un patatus",
                1,
                "luego"
            ),
            Carrito(
                "Croissant",
                "1.99€",
                "Croissant con fakin cafe? Perdedor",
                1,
                "luego"
            ),
            Carrito(
                "Nestea",
                "1.99€",
                "El te para los españoles",
                1,
                "luego"
            ),
            Carrito(
                "Hamburguesa",
                "6.95€",
                "Hamburgesika con su hueviko su ketxu' y eso",
                2,
                "luego"
            )
        )
    }
}