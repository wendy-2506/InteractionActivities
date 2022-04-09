package com.example.interactionactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMessage: EditText = findViewById(R.id.etMessage)
        val btnSend: Button = findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            this.sendMessage(etMessage.text.toString());
        }
    }

    private fun sendMessage(message: String)
    {
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("param",message)
        startActivity(intent)
    }


    override fun onStart() {
        super.onStart()
        Log.i(tag,"MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag,"MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag,"MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag,"MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag,"MainActivity onDestroy")
    }
}