package com.laisd.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.Serializable

class HomeActivity : AppCompatActivity(), HomeRecyclerviewAdapter. IRestaurantItemClick{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeViewManager = LinearLayoutManager(this)
        val homeRecyclerView = findViewById<RecyclerView>(R.id.homeRecyclerView)

        val pratosTonyRomas = arrayListOf<Prato>(
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.aoyamamoema, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
        )

        val pratosAoyama = arrayListOf<Prato>(
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
            Prato(R.drawable.tonysroma, "Camarão a Provençal", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
        )

        val homeRestaurantesDataSet = arrayListOf<Restaurante>(
            Restaurante(R.drawable.tonysroma, "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00", pratosTonyRomas),
            Restaurante(R.drawable.aoyamamoema, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", pratosAoyama),
            Restaurante(R.drawable.outbackmoema, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00", pratosTonyRomas),
            Restaurante(R.drawable.sisenor, "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "Fecha às 01:00", pratosAoyama)
        )

        val homeViewAdapter = HomeRecyclerviewAdapter(homeRestaurantesDataSet, this)

        homeRecyclerView.apply {
            layoutManager = homeViewManager
            adapter = homeViewAdapter
        }
    }

    override fun onRestaurantClick(dataSet: Restaurante, position: Int) {
        val intent = Intent(this, PratosActivity::class.java)
        intent.putExtra("RESTAURANTEFOTO", dataSet.foto)
        intent.putExtra("RESTAURANTENOME", dataSet.nome)
        intent.putParcelableArrayListExtra("RESTAURANTECARDAPIO", dataSet.cardapioDePratos)
        startActivity(intent)
    }
}