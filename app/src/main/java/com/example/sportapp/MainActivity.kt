package com.example.sportapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Login = findViewById<TextView>(R.id.Login_Lable)
        val Password = findViewById<TextView>(R.id.Password_Lable)
        val Button: Button = findViewById(R.id.Button)

        val LinkReg: TextView = findViewById(R.id.RegisterLink)

        Button.setOnClickListener{
            var LoginText = Login.text.trim().toString()
            var PasswordText = Password.text.trim().toString()

            if(LoginText.trim().isEmpty()){
                Toast.makeText(
                    this,
                    "Введіть будь ласка свій логін",
                    Toast.LENGTH_SHORT
                ).show()
            }
            if(PasswordText.trim().isEmpty()){
                Toast.makeText(
                    this,
                    "Введіть будь ласка свій пароль",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else{
                Toast.makeText(
                    this,
                    "Успішно",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        LinkReg.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}