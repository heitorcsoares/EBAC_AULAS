package com.example.hqawasomeapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.hqawasomeapp.placeholder.PlaceholderContent.PlaceholderItem
import com.example.hqawasomeapp.databinding.FragmentItemBinding

interface HQItemListener {
    fun onItemSelected(position: Int)
}

class MyhqRecyclerViewAdapter(
    private val values: List<PlaceholderItem>,
    private val listener: HQItemListener                            //Adiciona ouvinte como um parametro do construtor
) : RecyclerView.Adapter<MyhqRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.bindItem(item)

        holder.view.setOnClickListener {
            listener.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(private val binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val view = binding.root

        fun bindItem(item: PlaceholderItem){
            binding.hqItem = item
            binding.executePendingBindings()            //Atualiza dados na tela Atual.
        }
    }
}