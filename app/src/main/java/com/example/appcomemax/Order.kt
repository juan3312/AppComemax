package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val btnmenu = this.findViewById<ImageView>(R.id.btnmenu)
        btnmenu.setOnClickListener {
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
        val imgtitulo = this.findViewById<ImageView>(R.id.imgtitulo)
        imgtitulo.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val imgaddcart = this.findViewById<ImageView>(R.id.imgaddcart)
        imgaddcart.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}