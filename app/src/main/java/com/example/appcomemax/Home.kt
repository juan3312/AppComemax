package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnmenu = this.findViewById<ImageView>(R.id.btnmenu)
        btnmenu.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            //Start you next activity
            startActivity(intent)
        }

        val titulo = this.findViewById<TextView>(R.id.titulo)
        titulo.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            //Start you next activity
            startActivity(intent)
        }

        val imgenlatados = this.findViewById<ImageView>(R.id.imgenlatados)
        imgenlatados.setOnClickListener {
            val intent = Intent(this, CategoriaEnlatados::class.java)
            //Start you next activity
            startActivity(intent)
        }

        val imglacteos = this.findViewById<ImageView>(R.id.imglacteos)
        imglacteos.setOnClickListener {
            val intent = Intent(this, CategoriaLacteos::class.java)
            //Start you next activity
            startActivity(intent)
        }

        val imgpanaderia = this.findViewById<ImageView>(R.id.imgpanaderia)
        imgpanaderia.setOnClickListener {
            val intent = Intent(this, CategoriaPanaderia::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val btnofertas = this.findViewById<Button>(R.id.btnofertas)
        btnofertas.setOnClickListener {
            val intent = Intent(this, ShopList::class.java)
            //Start you next activity
            startActivity(intent)
        }

    }
}