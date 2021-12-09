package com.example.apptest4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var buttonBackSmartphone: Button
lateinit var buttonSendOrderSmartphone: Button

class SmarphoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smarphone)

        buttonBackSmartphone = findViewById(R.id.buttonBack)
        buttonSendOrderSmartphone = findViewById(R.id.buttonSendOrder)

        buttonBackSmartphone.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,MainActivity::class.java)
            startActivity(MainActivityIntent) }

        buttonSendOrderSmartphone.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,OrderActivity::class.java)
            startActivity(MainActivityIntent) }
    }
}