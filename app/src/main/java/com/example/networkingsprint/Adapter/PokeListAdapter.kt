package com.example.networkingsprint.Adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.networkingsprint.model.PokeRecycler

class PokeListAdapter(val data: MutableList<PokeRecycler>):RecyclerView
.Adapter<PokeListAdapter.ViewHolder>(){

    class ViewHolder(view: ViewGroup):RecyclerView.ViewHolder(view){
        val name: TextView =
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}