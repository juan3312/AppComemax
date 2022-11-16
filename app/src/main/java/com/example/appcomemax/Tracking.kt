package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Tracking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracking)

        val imgtracking = this.findViewById<ImageView>(R.id.imgtracking)
        imgtracking.setOnClickListener {
            val intent = Intent(this, Ofertas::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}