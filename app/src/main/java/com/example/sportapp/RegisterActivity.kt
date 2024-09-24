package com.example.sportapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val Login = findViewById<TextView>(R.id.RegisterLogin)
        val ButtonRegister = findViewById<Button>(R.id.button)


        ButtonRegister.setOnClickListener(){
            val RegLoginUserText = Login.text.trim().toString()
            if(RegLoginUserText.trim().isEmpty()){
                Toast.makeText(
                    this,
                    "Введіть будь ласка свій логін",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }



    }
}