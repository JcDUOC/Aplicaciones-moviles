package com.example.proyectobase.utils

object conversor_peso_dolar {
    private val constPesoDolar : Double = 900.0


    fun convertirToUsd (pesos : Int) : Double{
        var dolars : Double = pesos / this.constPesoDolar
        return dolars
    }
}