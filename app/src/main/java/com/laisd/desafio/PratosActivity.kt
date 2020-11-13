package com.laisd.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PratosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pratos)

        val pratosNome = findViewById<TextView>(R.id.txtNomeRestaurante)
        val pratosFoto = findViewById<ImageView>(R.id.imgFotoRestaurante)
        val backButton = findViewById<Button>(R.id.pratosBtnBack)

        pratosNome.text = intent.getStringExtra("RESTAURANTENOME")
        pratosFoto.setImageResource(intent.getIntExtra("RESTAURANTEFOTO", 0))

        backButton.setOnClickListener {
            finish()
        }
    }
}