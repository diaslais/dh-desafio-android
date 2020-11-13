package com.laisd.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val backButton = findViewById<Button>(R.id.detalheBtnBack)

        backButton.setOnClickListener {
            finish()
        }

        val fotoDetalheCardapio = findViewById<ImageView>(R.id.imgFotoDoPrato)
        val nomeDetalhe = findViewById<TextView>(R.id.txtNomePrato)
        val descricaoDetalhe = findViewById<TextView>(R.id.txtDescricaoPrato)

        fotoDetalheCardapio.setImageResource(intent.getIntExtra("PRATOFOTO", 0))
        nomeDetalhe.text = intent.getStringExtra("PRATONOME")
        descricaoDetalhe.text = intent.getStringExtra("PRATODESCRICAO")


    }
}