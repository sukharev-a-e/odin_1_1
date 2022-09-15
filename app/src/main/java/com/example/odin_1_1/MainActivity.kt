package com.example.odin_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x: Int = 30
        val y: Int = 40
        val z: Int = 5
        val volume = x * y * z

        //val FirstText = findViewById<TextView>(R.id.volume)
        val FirstText: TextView
        FirstText = findViewById(R.id.volume)

        FirstText.text = "Объем параллелепипеда со сторонами $x, $y и $z равен $volume."
    }



}