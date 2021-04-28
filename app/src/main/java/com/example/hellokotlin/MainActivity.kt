package com.example.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnJava = findViewById<Button>(R.id.btnJava)
        var btnKotlin = findViewById<Button>(R.id.btnKotlin)

        btnJava.setOnClickListener {
 //           Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
            startActivity(Intent(this@MainActivity, BmiJavaActivit::class.java))
        }

        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivit::class.java))
        }
    }
}