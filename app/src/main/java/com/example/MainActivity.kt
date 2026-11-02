package com.example.myfirstapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


   val input = findViewById<EditText>(R.id.inputField)
      

        val message = findViewById<TextView>(
            R.id.message
        )

        val button = findViewById<Button>(
            R.id.btnClick
        )

     

        button.setOnClickListener {
     val value = input.text.toString()
            message.text = "Hello $value, your message was sent, wait for response thanks for waiting" 
        }
    }
}