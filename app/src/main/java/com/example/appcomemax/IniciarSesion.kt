package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class IniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciarsesion)

        val btolvide_1 = this.findViewById<TextView>(R.id.btnolvide_1)
        btolvide_1.setOnClickListener {
             val intent = Intent(this, Restaurar_Contrasena::class.java)
             //Start you next activity
             startActivity(intent)
        }
        val btniniciarsesion = this.findViewById<Button>(R.id.btniniciarsesion)
        btniniciarsesion.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val btnrginicio = this.findViewById<TextView>(R.id.btnrginicio)
        btnrginicio.setOnClickListener {
            val intent = Intent(this, Registrarse::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}