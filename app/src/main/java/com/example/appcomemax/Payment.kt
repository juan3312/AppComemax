package com.example.appcomemax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val imgpayment = this.findViewById<ImageView>(R.id.imgpayment)
        imgpayment.setOnClickListener {
            val intent = Intent(this, Confirmacion::class.java)
            //Start you next activity
            startActivity(intent)
        }
    }
}