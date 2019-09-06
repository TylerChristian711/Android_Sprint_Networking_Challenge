package com.example.networkingsprint

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface PokemonApiInterface {

    @GET("/")
    fun getPokemon(): Call<Pokemon>
}