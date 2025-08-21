package com.example.proyectobase

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //ACTIVITY DESTINO
        val msjeBienvenida:TextView = findViewById(R.id.tx_bienvenido)
        //creo variable asigno valor recibido desde otro activity
        val usuarioDesdeOtroActivity = intent.getStringExtra("sesion")
        //seteo un TextView reemplazando el texto por el contenido.
        msjeBienvenida.text = usuarioDesdeOtroActivity.toString()

        val recibeContrasena = getIntent().getStringExtra("par_contrasena")

        val editUser:EditText = findViewById(R.id.ed_user_2)
        val editpassword:EditText = findViewById(R.id.editPassword2)

        editUser.setText(usuarioDesdeOtroActivity.toString())
        editpassword.setText(recibeContrasena.toString())

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}