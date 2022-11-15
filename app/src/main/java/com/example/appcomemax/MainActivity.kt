package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btniniciar = this.findViewById<Button>(R.id.btniniciar)
        btniniciar.setOnClickListener {
            val intent = Intent(this, IniciarSesion::class.java)
            //Start you next activity
            startActivity(intent)}
        }
    }