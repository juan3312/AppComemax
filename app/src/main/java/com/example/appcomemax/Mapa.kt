package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Mapa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa)

        val imgayuda = this.findViewById<ImageView>(R.id.imgayuda)
        imgayuda.setOnClickListener {
            val intent = Intent(this, Ayuda::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}