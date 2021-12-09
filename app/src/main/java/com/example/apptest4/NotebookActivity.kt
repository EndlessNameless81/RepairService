package com.example.apptest4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var buttonBackNotebook: Button
lateinit var buttonSendOrderNotebook: Button

class NotebookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notebook)

        buttonBackNotebook = findViewById(R.id.buttonBack)
        buttonSendOrderNotebook = findViewById(R.id.buttonSendOrder)

        buttonBackNotebook.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,MainActivity::class.java)
            startActivity(MainActivityIntent) }

        buttonSendOrderNotebook.setOnClickListener {

            val MainActivityIntent: Intent = Intent(this,OrderActivity::class.java)
            startActivity(MainActivityIntent) }
    }
}