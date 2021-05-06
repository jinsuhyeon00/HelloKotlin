package com.example.hellokotlin

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FlowControlKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_flowcontrol)

        val fieldNumber = findViewById<TextView>(R.id.fieldNum)
        val btnLD = findViewById<TextView>(R.id.btnLD)

        btnLD.setOnClickListener {
            val number = fieldNumber.text.toString().toInt()

            if (number % 2 == 0) {
                Toast.makeText(applicationContext, "" + number + "은(는) 2의 배수", Toast.LENGTH_SHORT).show()

            } else if (number % 3 == 0) {
                Toast.makeText(applicationContext, "" + number + "은(는) 3의 배수", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "" + number + "은(는) else", Toast.LENGTH_LONG).show()
            }
            when(number){
   //             4 -> btnLD.text = "실행 for 4"
   //             9 -> btnLD.text = "실행 for 9"
                 4,9-> btnLD.text = "실행 for ${number}"
                else -> btnLD.text = "실행"
            }
        }
    }
}