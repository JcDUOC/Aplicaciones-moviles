package com.example.proyectobase.API.model

import kotlinx.serialization.Serializable

@Serializable
data class Alumno(
    val id: Int,
    val nombre: String,
    val apellido: String,
    val grupo: String,
    val seccion: String,
    val archivo: String
)