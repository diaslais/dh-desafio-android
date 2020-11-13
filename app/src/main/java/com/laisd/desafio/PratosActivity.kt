package com.laisd.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        val pratosViewManager = GridLayoutManager(this, 2)
        val pratosRecyclerView = findViewById<RecyclerView>(R.id.pratosRecyclerView)

        val pratosDataSet = arrayListOf<Prato>(
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre"),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre")
        )

        val pratosViewAdapter = PratosRecyclerviewAdapter(pratosDataSet)

        pratosRecyclerView.apply {
            layoutManager = pratosViewManager
            adapter = pratosViewAdapter
        }
    }
}