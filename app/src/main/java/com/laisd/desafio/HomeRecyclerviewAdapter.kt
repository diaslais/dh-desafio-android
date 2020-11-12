package com.laisd.desafio

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class HomeRecyclerviewAdapter: RecyclerView.Adapter<HomeRecyclerviewAdapter.HomeViewHolder>() {

    class HomeViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private var fotoHome = view.findViewById<ImageView>(R.id.imgHome)
        private var nomeHome = view.findViewById<TextView>(R.id.txtHomeNome)
        private var enderecoHome = view.findViewById<TextView>(R.id.txtHomeEndereco)
        private var horarioHome = view.findViewById<TextView>(R.id.txtHomeHorario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}