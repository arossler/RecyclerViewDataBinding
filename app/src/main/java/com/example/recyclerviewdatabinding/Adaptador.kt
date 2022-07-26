package com.example.recyclerviewdatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdatabinding.data.Conversa
import com.example.recyclerviewdatabinding.databinding.ConversaItemBinding

class Adaptador (val conjuntoDados: MutableList<Conversa>):
    RecyclerView.Adapter<Adaptador.ConversaViewHolder>(){

    inner class ConversaViewHolder(val binding: ConversaItemBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {
        var binding = ConversaItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ConversaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConversaViewHolder, position: Int) {
        holder.binding.conversa = conjuntoDados[position]

    }

    override fun getItemCount(): Int {
        return conjuntoDados.size
    }
}