package com.example.myfirstapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val message = findViewById<TextView>(
            R.id.message
        )

        val button = findViewById<Button>(
            R.id.btnClick
        )

        button.setOnClickListener {
            message.text = "Hello from Kotlin!"
        }
    }
}