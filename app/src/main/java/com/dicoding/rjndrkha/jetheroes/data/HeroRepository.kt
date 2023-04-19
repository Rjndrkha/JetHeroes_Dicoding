package com.dicoding.rjndrkha.jetheroes.data

import com.dicoding.rjndrkha.jetheroes.model.Hero
import com.dicoding.rjndrkha.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}