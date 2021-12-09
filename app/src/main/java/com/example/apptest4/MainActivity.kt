package com.example.apptest4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

public val TYPE_ORDER_KEY = ""

class MainActivity : AppCompatActivity() {

    //init button
    lateinit var imageButtonNotebook: ImageButton
    lateinit var imageButtonSmartphone: ImageButton
    lateinit var imageButtonMediapad: ImageButton
    lateinit var imageButtonComputer: ImageButton
    lateinit var imageButtonPrinter: ImageButton
    lateinit var imageButtonRoute: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find button by ID
        imageButtonNotebook = findViewById(R.id.imageButtonNotebook)
        imageButtonSmartphone = findViewById(R.id.imageButtonSmartphone)
        imageButtonMediapad = findViewById(R.id.imageButtonMediapad)
        imageButtonComputer = findViewById(R.id.imageButtonComputer)
        imageButtonPrinter = findViewById(R.id.imageButtonPrinter)
        imageButtonRoute = findViewById(R.id.imageButtonRoute)

        //NOTEBOOK
        imageButtonNotebook.setOnClickListener {

            val MainActivityIntent:Intent = Intent(this,NotebookActivity::class.java)
            MainActivityIntent.putExtra(TYPE_ORDER_KEY, "Repair Device Notebook")
            startActivity(MainActivityIntent) }

        //SMARTPHONE
        imageButtonSmartphone.setOnClickListener {

            val MainActivityIntent:Intent = Intent(this,SmarphoneActivity::class.java)
            MainActivityIntent.putExtra(TYPE_ORDER_KEY, "Repair Device Smartphone")
            startActivity(MainActivityIntent) }

        //MEDIAPAD
        imageButtonMediapad.setOnClickListener {

            val MainActivityIntent:Intent = Intent(this,MediapadActivity::class.java)
            MainActivityIntent.putExtra(TYPE_ORDER_KEY, "Repair Device Mediapad")
            startActivity(MainActivityIntent) }

        //COMPUTER
        imageButtonComputer.setOnClickListener {

            val MainActivityIntent:Intent = Intent(this,ComputerActivity::class.java)
            MainActivityIntent.putExtra(TYPE_ORDER_KEY, "Repair Device Computer")
            startActivity(MainActivityIntent) }

        //PRINTER
        imageButtonPrinter.setOnClickListener {

            val MainActivityIntent:Intent = Intent(this,PrinterActivity::class.java)
            MainActivityIntent.putExtra(TYPE_ORDER_KEY, "Repair Device Printer")
            startActivity(MainActivityIntent) }

        //ROUTE
        imageButtonRoute.setOnClickListener {

            val MainActivityIntent:Intent = Intent(this,RouteActivity::class.java)
            MainActivityIntent.putExtra(TYPE_ORDER_KEY, "Repair Device Route")
            startActivity(MainActivityIntent) }


    }
}