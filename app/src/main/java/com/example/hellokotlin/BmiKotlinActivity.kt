package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        val heightField = findViewById<EditText>(R.id.heightField)
        val weightField = findViewById<EditText>(R.id.weightField)
        val btnBmi = findViewById<Button>(R.id.btnBmi)
        val textResult = findViewById<TextView>(R.id.txtResult)

        btnBmi.setOnClickListener {
//            val Height = heightField.getText().toString().toDouble()
//            val Weight = weightField.getText().toString().toDouble()

            val sHeight = heightField.getText().toString()
            val sWeight = weightField.getText().toString()
/*            try{
                val bmi = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100, 2.0);
                textResult.setText("Your BMI = " + bmi)
            }catch (e : Exception){
                textResult.setText("inpus(S) missing")
            }
*/
            if(!sHeight.equals("") && !sWeight.equals("")){
                val bmi = sWeight.toDouble() / Math.pow(sHeight.toDouble() / 100.0, 2.0);
                textResult.setText("Your BMI = " + bmi)
            }else{
                textResult.setText("inpus(S) missing")
            }
        }
    }
}