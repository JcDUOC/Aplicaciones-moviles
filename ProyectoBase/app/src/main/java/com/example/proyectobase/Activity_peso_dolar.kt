package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.utils.conversor_peso_dolar

class Activity_peso_dolar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_peso_dolar)

        val txtValor : EditText = findViewById(R.id.valorInicial)

        val btnCalcular : Button = findViewById(R.id.btnCalcular2)

        val txtViewCon : TextView = findViewById(R.id.txtVResultConversion)

        btnCalcular.setOnClickListener {
            var valorIn : Int = txtValor.text.toString().toIntOrNull() ?: 0

            var resultado : String = conversor_peso_dolar.convertirToUsd(valorIn).toString()

            txtViewCon.text = resultado


        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}