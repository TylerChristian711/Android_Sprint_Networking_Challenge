package com.example.networkingsprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.networkingsprint.Adapter.PokeListAdapter
import com.example.networkingsprint.model.PokeRecycler
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<Pokemon> {
    override fun onFailure(call: Call<Pokemon>, t: Throwable) {

    }

    override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                if (response.code()== 200 || response.code() == 201)
                    search_view.text = response.body()?.name
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val data = mutableListOf<Pokemon>()

        poke_recycler.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = PokeListAdapter(data)

          RetrofitInstance.getPokemon().enqueue(this)

    }
}
