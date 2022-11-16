package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Registrarse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        val btninicio_R = this.findViewById<Button>(R.id.btninicio_R)
        btninicio_R.setOnClickListener {
            val intent = Intent(this, IniciarSesion::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtOlv = this.findViewById<TextView>(R.id.txtOlv)
        txtOlv.setOnClickListener {
            val intent = Intent(this, Restaurar_Contrasena::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}