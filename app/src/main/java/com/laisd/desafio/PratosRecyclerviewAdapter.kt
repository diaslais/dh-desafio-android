package com.laisd.desafio

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PratosRecyclerviewAdapter (private val pratosDataSet: List<Prato>, var clickListener: ICardapioItemClick): RecyclerView.Adapter<PratosRecyclerviewAdapter.PratosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_prato_recyclerview, parent, false)
        return PratosRecyclerviewAdapter.PratosViewHolder(view)
    }

    override fun getItemCount() = pratosDataSet.size

    override fun onBindViewHolder(holder: PratosViewHolder, position: Int) {
        holder.bind(pratosDataSet[position], clickListener)
    }

    class PratosViewHolder(view: View): RecyclerView.ViewHolder(view){
        private var fotoDetalhe= view.findViewById<ImageView>(R.id.imgDetalheCardapio)
        private var nomeDetalhe = view.findViewById<TextView>(R.id.txtNomeDetalheCardapio)

        fun bind(prato: Prato, action: ICardapioItemClick){
            fotoDetalhe.setImageResource(prato.foto)
            nomeDetalhe.text = prato.nome

            itemView.setOnClickListener {
                action.onCardapioClick(prato, adapterPosition)
            }
        }
    }

    interface ICardapioItemClick {
        fun onCardapioClick(dataSetItem: Prato, position: Int)
    }
}