package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class iniciosesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciosesion)

        val btnrginicio = this.findViewById<Button>(R.id.btnrginicio)
        btnrginicio.setOnClickListener {
            val intent = Intent(this, registrarse::class.java)
            //Start you next activity
            startActivity(intent)}
    }
}