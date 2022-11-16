package com.example.appcomemax

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Puntos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puntos)

        val btnmenu_puntos = this.findViewById<ImageView>(R.id.btnmenu_puntos)
        btnmenu_puntos.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val btnofertas = this.findViewById<Button>(R.id.btnofertas)
        btnofertas.setOnClickListener {
            val intent = Intent(this, ShopList::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val imgpuntos = this.findViewById<ImageView>(R.id.imgpuntos)
        imgpuntos.setOnClickListener {
            val intent = Intent(this, TiendaPuntos::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}