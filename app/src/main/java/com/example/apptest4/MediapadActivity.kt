package com.example.apptest4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var buttonBackMediapad: Button
lateinit var buttonSendOrderMediapad: Button

class MediapadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediapad)

        buttonBackMediapad = findViewById(R.id.buttonBack)
        buttonSendOrderMediapad = findViewById(R.id.buttonSendOrder)

        buttonBackMediapad.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,MainActivity::class.java)
            startActivity(MainActivityIntent) }

        buttonSendOrderMediapad.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,OrderActivity::class.java)
            startActivity(MainActivityIntent) }
    }
}