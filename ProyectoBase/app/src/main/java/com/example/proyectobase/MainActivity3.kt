package com.example.proyectobase

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.utils.OpMate

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val number1 : EditText = findViewById(R.id.editNumber1)
        val number2 : EditText = findViewById(R.id.editNumber2)
        val btnCalcular : Button = findViewById(R.id.btnCalcular)
        val spinnerOpe : Spinner = findViewById(R.id.spinnerOperaciones)

        val menuOpciones = arrayOf("suma", "restar", "multiplicar", "dividir")

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menuOpciones)


        btnCalcular.setOnClickListener{
            var valorNumber1 : Int? = number1.text.toString().toIntOrNull()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}