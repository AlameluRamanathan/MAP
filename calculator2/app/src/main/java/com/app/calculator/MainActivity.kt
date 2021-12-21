package com.app.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var num1 : EditText
    lateinit var num2 : EditText
    lateinit var result : TextView
    lateinit var add : Button
    lateinit var sub : Button
    lateinit var mul : Button
    lateinit var division : Button
    lateinit var value1 :String
    lateinit var value2 :String
    lateinit var answer :String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.num1)
        num2 =findViewById(R.id.num2)
        result=findViewById(R.id.result)
        add =findViewById(R.id.add)
        sub=findViewById(R.id.sub)
        mul = findViewById(R.id.mul)
        division =findViewById(R.id.division)

        add.setOnClickListener {

            value1 =num1.text.toString()
            value2 = num2.text.toString()
            if (isvalid(value1, value2)){
                answer = (value1.toInt() + value2.toInt()).toString()
                result.text="Addition: "+ answer
            }
        }
        sub.setOnClickListener {
            value1 =num1.text.toString()
            value2 =num2.text.toString()
            if (isvalid(value1, value2)){
                answer = (value1.toInt() - value2.toInt()).toString()
                result.text="Subtraction: "+ answer
            }


        }
        mul.setOnClickListener {
            value1 =num1.text.toString()
            value2 =num2.text.toString()
            if (isvalid(value1, value2)){
                answer = (value1.toInt() * value2.toInt()).toString()
                result.text="Multiplication: "+ answer
            }
        }
        division.setOnClickListener {
            value1 =num1.text.toString()
            value2 =num2.text.toString()

            if (isvalid(value1, value2)){
                answer = (value1.toDouble() / value2.toDouble()).toString()
                result.text="Division: "+ answer
            }
        }

    }
    fun isvalid(x: String, y : String ): Boolean {
        if (x.isEmpty()){
            Toast.makeText(this@MainActivity, "Please enter first value", Toast.LENGTH_SHORT).show()
            return false
        }
        else if (y.isEmpty()){
            Toast.makeText(this@MainActivity, "Please enter second value", Toast.LENGTH_SHORT).show()
            return false

        }
        return true
    }

}