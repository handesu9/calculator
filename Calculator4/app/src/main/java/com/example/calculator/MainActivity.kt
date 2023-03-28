package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        addButton.setOnClickListener {
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val result = num1 + num2
            resultTextView.text = result.toString()
        }

        subtractButton.setOnClickListener {
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val result = num1 - num2
            resultTextView.text = result.toString()
        }

        multiplyButton.setOnClickListener {
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val result = num1 * num2
            resultTextView.text = result.toString()
        }

        divideButton.setOnClickListener {
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val result = num1 / num2
            resultTextView.text = result.toString()
        }
    }
}
