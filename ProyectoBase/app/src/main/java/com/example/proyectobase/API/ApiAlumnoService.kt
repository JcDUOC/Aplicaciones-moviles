package com.example.proyectobase.API

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class InsertResponse(
    val success: Boolean,
    val message: String?
)

interface ApiAlumnoService {
    @GET("apiduoc/consulta.php")
    suspend fun getAlumnos(): List<Alumno>

    @POST("apiduoc/insert.php")
    suspend fun insertAlumno(@Body request: Alumno): InsertResponse
}