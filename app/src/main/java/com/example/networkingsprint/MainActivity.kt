package com.example.networkingsprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<Pokemon> {
    override fun onFailure(call: Call<Pokemon>, t: Throwable) {

    }

    override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                if (response.code()== 200 || response.code() == 201)
                    text_poke.text = response.body()?.name
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          RetrofitInstance.getPokemon().enqueue(this)
    }
}
