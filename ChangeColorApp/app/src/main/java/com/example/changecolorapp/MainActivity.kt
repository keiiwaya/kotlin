package com.example.changecolorapp

import android.graphics.Color
import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val constraint = findViewById<ConstraintLayout>(R.id.constraint)

        val rTextView = findViewById<TextView>(R.id.rView)
        val gTextView = findViewById<TextView>(R.id.gView)
        val bTextView = findViewById<TextView>(R.id.bView)


        button.setOnClickListener {
            val r = ransuu()
            val g = ransuu()
            val b = ransuu()

            constraint.setBackgroundColor(Color.rgb(r, g, b))

            rTextView.text = r.toString()
            gTextView.setText(r.toString())
            bTextView.setText(b.toString())

        }

        button2.setOnClickListener {
            constraint.setBackgroundColor(Color.CYAN)
        }

    }

    fun ransuu(): Int {
        val x = (0..256).random()

        return x
    }
}
