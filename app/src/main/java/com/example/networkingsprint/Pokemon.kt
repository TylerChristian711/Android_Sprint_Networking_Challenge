package com.example.networkingsprint
import com.google.gson.annotations.SerializedName

data class Pokemon(val name: String,
                   @SerializedName("front_default")
                   val spriteUrl: String,
                   val id: Int,
                   val abilities: List<PokemonAbility>, val sprites:String)
data class PokemonAbility(val ability: Ability)
data class Ability(val name:String, val url:String)






