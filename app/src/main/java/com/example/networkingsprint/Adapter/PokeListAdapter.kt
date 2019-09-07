package com.example.networkingsprint.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.networkingsprint.Pokemon
import com.example.networkingsprint.R
import com.example.networkingsprint.model.PokeRecycler
import kotlinx.android.synthetic.main.poke_recycler.view.*

class PokeListAdapter(val data: MutableList<Pokemon>):RecyclerView
.Adapter<PokeListAdapter.ViewHolder>(){

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val name: TextView = view.poke_text
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.poke_recycler,parent,false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = data[position].name
    }


}