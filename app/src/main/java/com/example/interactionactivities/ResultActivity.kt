package com.example.interactionactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val message = intent.getSStringExtra(name:"param")
        val textView = findViewById<TextView>(R.id.tvResult)
        textView.text = messageval btnBack: Button = findViewById(R.id.btnBack)

        btnBack.setOnClickListener{
            val intent = Intent(packageContenxt: this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}