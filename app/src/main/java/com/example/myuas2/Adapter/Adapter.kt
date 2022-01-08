package com.example.myuas2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myuas2.Model.Model
import com.example.myuas2.R

class Adapter (
    val toko: ArrayList<Model.Data>
): RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter, parent, false)
    )

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val data = toko[position]
        holder.textNama.text = data.nama
        holder.textPenulis.text = data.penulis
    }

    override fun getItemCount() = toko.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textNama = view.findViewById<TextView>(R.id.textnama)
        val textPenulis = view.findViewById<TextView>(R.id.textpenulis)
    }

    public fun setData(data: List<Model.Data>){
        toko.clear()
        toko.addAll(data)
        notifyDataSetChanged()
    }

}