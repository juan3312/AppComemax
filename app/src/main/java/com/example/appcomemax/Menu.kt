package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnpuntos = this.findViewById<TextView>(R.id.btnpuntos)
        btnpuntos.setOnClickListener {
            val intent = Intent(this, Puntos::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtordenes = this.findViewById<TextView>(R.id.txtordenes)
        txtordenes.setOnClickListener {
            val intent = Intent(this, Order::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtexplorarTienda = this.findViewById<TextView>(R.id.txtexplorarTienda)
        txtexplorarTienda.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtdescuentos = this.findViewById<TextView>(R.id.txtdescuentos)
        txtdescuentos.setOnClickListener {
            val intent = Intent(this, ShopList::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtdatop = this.findViewById<TextView>(R.id.txtdatop)
        txtdatop.setOnClickListener {
            val intent = Intent(this, DatoPerfil::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtmapa = this.findViewById<TextView>(R.id.txtmapa)
        txtmapa.setOnClickListener {
            val intent = Intent(this, Mapa::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtayuda = this.findViewById<TextView>(R.id.txtayuda)
        txtayuda.setOnClickListener {
            val intent = Intent(this, Ayuda::class.java)
            //Start you next activity
            startActivity(intent)
        }
        val txtsalir = this.findViewById<TextView>(R.id.txtsalir)
        txtsalir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            //Start you next activity
            startActivity(intent)
        }


    }
}