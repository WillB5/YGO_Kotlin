package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val cardName = intent.getStringExtra("cardName")
        val textView = findViewById<TextView>(R.id.displayName)

        val url = ""

        val okHttpClient = OkHttpClient()
        val _request = Request.Builder()
            .url("")
            .build()

        textView.setText("Card Name: "+ cardName)
    }


}