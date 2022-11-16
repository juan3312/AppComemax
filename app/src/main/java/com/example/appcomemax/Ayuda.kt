package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        val imgenviar = this.findViewById<ImageView>(R.id.imgenviar)
        imgenviar.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}