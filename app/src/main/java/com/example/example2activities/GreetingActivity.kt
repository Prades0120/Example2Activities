package com.example.example2activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.greeting_layout)

        val intent = intent
        val b = intent.extras

        val name = b?.getString("name")
        val lastname = b?.getString("lastname")

        val text = findViewById<TextView>(R.id.textViewGreeting)
        text.text = "Hello $name $lastname"
    }
}