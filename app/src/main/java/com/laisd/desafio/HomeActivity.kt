package com.laisd.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity(), HomeRecyclerviewAdapter. IRestaurantItemClick{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeViewManager = LinearLayoutManager(this)
        val homeRecyclerView = findViewById<RecyclerView>(R.id.homeRecyclerView)

        val homeRestaurantesDataSet = arrayListOf<Restaurante>(
            Restaurante(R.drawable.tonysroma, "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00"),
            Restaurante(R.drawable.aoyamamoema, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00"),
            Restaurante(R.drawable.outbackmoema, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00"),
            Restaurante(R.drawable.sisenor, "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "Fecha às 01:00")
        )

        val homeViewAdapter = HomeRecyclerviewAdapter(homeRestaurantesDataSet, this)

        homeRecyclerView.apply {
            layoutManager = homeViewManager
            adapter = homeViewAdapter
        }
    }

    override fun onRestaurantClick(dataSet: Restaurante, position: Int) {
        Toast.makeText(this, dataSet.nome, Toast.LENGTH_LONG).show()
    }
}