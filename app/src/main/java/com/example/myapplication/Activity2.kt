package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val cardName = intent.getStringExtra("cardName")
        val textView = findViewById<TextView>(R.id.displayName)

        val _url = "https://db.ygoprodeck.com/api/v7/cardinfo.php?name=" + cardName

        val _okHttpClient = OkHttpClient()
        val _request = Request.Builder()
            .url(_url)
            .build()

        val _call: Call = _okHttpClient.newCall(_request)

        val _response: Response = _call.execute()


        textView.setText("Card Name: "+ cardName)
    }


}