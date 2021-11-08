package com.example.example2activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val editName = findViewById<EditText>(R.id.editTextName)
            val name = editName.text.toString()
            val editLastname = findViewById<EditText>(R.id.editTextLastname)
            val lastname = editLastname.text.toString()

            val intent = Intent(applicationContext, GreetingActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("lastname", lastname)

            startActivity(intent)
        }
    }
}