package com.laisd.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PratosActivity : AppCompatActivity(), PratosRecyclerviewAdapter.ICardapioItemClick {
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
            Prato(R.drawable.tonysroma, "Salada", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
        )

        val pratosViewAdapter = PratosRecyclerviewAdapter(pratosDataSet, this)

        pratosRecyclerView.apply {
            layoutManager = pratosViewManager
            adapter = pratosViewAdapter
        }
    }

    override fun onCardapioClick(dataSetItem: Prato, position: Int) {
        val intent = Intent(this, DetalheActivity::class.java)
        intent.putExtra("PRATOFOTO", dataSetItem.foto)
        intent.putExtra("PRATONOME", dataSetItem.nome)
        intent.putExtra("PRATODESCRICAO", dataSetItem.descricao)
        startActivity(intent)
    }
}