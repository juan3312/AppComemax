package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Confirmacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        val imgconfirmacion = this.findViewById<ImageView>(R.id.imgconfirmacion)
        imgconfirmacion.setOnClickListener {
            val intent = Intent(this, Tracking::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}