package com.example.Addition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var edittext_number_1 : EditText
    lateinit var edittext_number_2 : EditText
    lateinit var button_add : Button
    lateinit var textview_result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittext_number_1 = findViewById(R.id.edittext_number_1)
        edittext_number_2 =findViewById(R.id.edittext_number_2)
        button_add = findViewById(R.id.button_add)
        textview_result = findViewById(R.id.textview_result)

        button_add.setOnClickListener {
            val num1 = edittext_number_1.text.toString().toInt()
            val num2 = edittext_number_2.text.toString().toInt()
            val res =num1+num2
            textview_result.text = res.toString()
        }
        }
    }

