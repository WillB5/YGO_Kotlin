package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val cardName = intent.getStringExtra("cardName")
        val textView = findViewById<TextView>(R.id.displayName)


        textView.setText("hello"+ cardName)
    }


}