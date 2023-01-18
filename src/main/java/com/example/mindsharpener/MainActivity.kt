package com.example.mindsharpener

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*lateinit var number1: TextView
        lateinit var easy: RadioGroup
        lateinit var selectedRadioButton: RadioButton

        number1 = findViewById(R.id.textView)
        easy = findViewById(R.id.radioButton)
        easy.setOnClickListener {
            val selectedRadioButtonId: Int = easy.checkedRadioButtonId
            if (selectedRadioButtonId != -1) {
                val myRandomValues = List(5) { Random.nextInt(0, 99) }
                number1.text= myRandomValues.toString()
                //number1.text = "$string is Selected"
            } //else {
               // number1.text = "Nothing selected from the radio group"
            //}
        }*/

        val number1 = findViewById<View>(R.id.textView) as TextView
        val number2 = findViewById<View>(R.id.textView3) as TextView
        val radio_grp = findViewById(R.id.radioGroup) as RadioGroup
        val rb1 = findViewById(R.id.radioButton) as RadioButton
        val rb2 = findViewById(R.id.radioButton2) as RadioButton
        val rb3 = findViewById(R.id.radioButton3) as RadioButton
        val button1Listener =
            View.OnClickListener {
                val myRandomValues = Random.nextInt(0, 9)
                val myRandomValues2 = Random.nextInt(0, 9)
                number1.text = myRandomValues.toString()
                number2.text = myRandomValues2.toString()
            }

        val button2Listener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View) {
                val myRandomValues = Random.nextInt(0,99)
                val myRandomValues2 = Random.nextInt(0, 99)
                number1.text = myRandomValues.toString()
                number2.text = myRandomValues2.toString()
            }
        }
        val button3Listener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View) {
                val myRandomValues = Random.nextInt(0,999)
                val myRandomValues2 = Random.nextInt(0,999)
                number1.text = myRandomValues.toString()
                number2.text = myRandomValues2.toString()
            }
        }
        rb1.setOnClickListener(button1Listener)
        rb2.setOnClickListener(button2Listener)
        rb3.setOnClickListener(button3Listener)

    }
}
