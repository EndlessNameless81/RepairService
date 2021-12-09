package com.example.apptest4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var buttonBackComputer: Button
lateinit var buttonSendOrderComputer: Button

class ComputerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer)

        buttonBackComputer = findViewById(R.id.buttonBack)
        buttonSendOrderComputer = findViewById(R.id.buttonSendOrder)

        buttonBackComputer.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,MainActivity::class.java)
            startActivity(MainActivityIntent) }

        buttonSendOrderComputer.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,OrderActivity::class.java)
            startActivity(MainActivityIntent) }
    }
}