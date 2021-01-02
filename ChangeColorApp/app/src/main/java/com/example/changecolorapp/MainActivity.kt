package com.example.changecolorapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val constraint = findViewById<ConstraintLayout>(R.id.constraint)

        button.setOnClickListener {
            constraint.setBackgroundColor(Color.RED)
        }

        button2.setOnClickListener {
            constraint.setBackgroundColor(Color.CYAN)
        }

    }
}
