package com.example.apptest4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var buttonBackPrinter: Button
lateinit var buttonSendOrderPrinter: Button

class PrinterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_printer)

        buttonBackPrinter = findViewById(R.id.buttonBack)
        buttonSendOrderPrinter = findViewById(R.id.buttonSendOrder)

        buttonBackPrinter.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,MainActivity::class.java)
            startActivity(MainActivityIntent) }

        buttonSendOrderPrinter.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,OrderActivity::class.java)
            startActivity(MainActivityIntent) }
    }
}