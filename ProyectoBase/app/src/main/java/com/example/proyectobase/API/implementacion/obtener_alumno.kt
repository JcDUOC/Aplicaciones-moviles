package com.example.proyectobase.API.implementacion

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import com.example.proyectobase.API.model.Alumno
import com.example.proyectobase.API.retrofitAlumnos
import kotlinx.coroutines.launch

fun obtenerAlumnos(activ : LifecycleOwner, listView: ListView){
    activ.lifecycleScope.launch{
        try {
            var alumnos : List<Alumno> = retrofitAlumnos.service.getAlumnos()

            var datos : List<String>;

            if(alumnos.isEmpty()){
                Toast.makeText(listView.context, "no hay datos recibidos", Toast.LENGTH_SHORT).show()
                datos = listOf()
            } else {
                datos = alumnos.map { a ->
                    "Nombre: ${a.nombre}   Grupo: ${a.grupo}"
                }
            }


            listView.adapter = ArrayAdapter(listView.context, android.R.layout.simple_list_item_1, datos)



        } catch (e : Exception){
            Toast.makeText(listView.context, e.message, Toast.LENGTH_SHORT).show()
        }
    }


}