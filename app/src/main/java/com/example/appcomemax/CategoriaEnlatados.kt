package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CategoriaEnlatados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_enlatados)

        val btnofertas = this.findViewById<Button>(R.id.btnofertas)
        btnofertas.setOnClickListener {
            val intent = Intent(this, ShopList::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtEnlatados1 = this.findViewById<TextView>(R.id.txtEnlatados1)
        txtEnlatados1.setOnClickListener {
            val intent = Intent(this, CategoriaEnlatados::class.java)
            //Start you next activity
            startActivity(intent)
        }

        val txtDespensa = this.findViewById<TextView>(R.id.txtDespensa)
        txtDespensa.setOnClickListener {
            val intent = Intent(this, CategoriaEnlatados::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtCarnicos = this.findViewById<TextView>(R.id.txtCarnicos)
        txtCarnicos.setOnClickListener {
            val intent = Intent(this, CategoriaEnlatados::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtLacteos = this.findViewById<TextView>(R.id.txtLacteos)
        txtLacteos.setOnClickListener {
            val intent = Intent(this, CategoriaEnlatados::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtPanaderia = this.findViewById<TextView>(R.id.txtPanaderia)
        txtPanaderia.setOnClickListener {
            val intent = Intent(this, CategoriaEnlatados::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val imgaddcarrito1 = this.findViewById<ImageView>(R.id.imgaddcarrito1)
        imgaddcarrito1.setOnClickListener {
            val intent = Intent(this, Order::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val imgaddcarrito2 = this.findViewById<ImageView>(R.id.imgaddcarrito2)
        imgaddcarrito2.setOnClickListener {
            val intent = Intent(this, Order::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}