package com.laisd.desafio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class HomeRecyclerviewAdapter(private val homeDataSet: List<Restaurante>, var clickListener: IRestaurantItemClick): RecyclerView.Adapter<HomeRecyclerviewAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_recyclerview, parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount() = homeDataSet.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(homeDataSet[position], clickListener)
    }

    class HomeViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private var fotoHome = view.findViewById<ImageView>(R.id.imgHome)
        private var nomeHome = view.findViewById<TextView>(R.id.txtHomeNome)
        private var enderecoHome = view.findViewById<TextView>(R.id.txtHomeEndereco)
        private var horarioHome = view.findViewById<TextView>(R.id.txtHomeHorario)

        fun bind(restaurante: Restaurante, action: IRestaurantItemClick){
            fotoHome.setImageResource(restaurante.foto)
            nomeHome.text = restaurante.nome
            enderecoHome.text = restaurante.endereco
            horarioHome.text = restaurante.horario

            itemView.setOnClickListener {
                action.onRestaurantClick(restaurante, adapterPosition)
            }
        }
    }

    interface IRestaurantItemClick {
        fun onRestaurantClick(dataSet: Restaurante, position: Int)
    }
}