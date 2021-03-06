package com.laisd.desafio

import android.widget.ImageView
import android.widget.TextView
import java.io.Serializable

data class Restaurante (
    val foto: Int,
    val nome: String,
    val endereco: String,
    val horario: String,
    val cardapioDePratos: ArrayList<Prato>
)