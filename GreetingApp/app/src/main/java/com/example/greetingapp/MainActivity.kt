package com.example.greetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        var morningBtn = findViewById<Button>(R.id.asaBtn)
        var afternoonBtn = findViewById<Button>(R.id.hiruBtn)
        var eveningBtn = findViewById<Button>(R.id.banBtn)

        morningBtn.setOnClickListener{
            textView.text = "朝"
        }

        afternoonBtn.setOnClickListener{
            textView.text = "昼"
       }

        eveningBtn.setOnClickListener{
            textView.text = "晩"
        }

    }
}
