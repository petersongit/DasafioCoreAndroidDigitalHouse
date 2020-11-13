package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PratosAdapter(private val listDePratos: List<Prato>):RecyclerView.Adapter<PratosAdapter.PratosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.card_comida, parent, false)
        return PratosViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listDePratos.size
    }

    override fun onBindViewHolder(holder: PratosViewHolder, position: Int) {
        val currentItem: Prato = listDePratos[position]

        holder.imgPrato.setImageResource(currentItem.imagem)
        holder.tvNome.setText(currentItem.nome)
        holder.tvEndereco.setText(currentItem.endereco)
        holder.tvHoraFechamento.setText(currentItem.hora_fechamento)

    }

    inner class PratosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imgPrato: ImageView = itemView.findViewById(R.id.imgPrato)
        val tvNome: TextView = itemView.findViewById(R.id.tvNomeRestaurante)
        val tvEndereco: TextView = itemView.findViewById(R.id.tvEnderecoRestaurante)
        val tvHoraFechamento: TextView = itemView.findViewById((R.id.tvHoraFechamentoRestaurante))
    }
}

