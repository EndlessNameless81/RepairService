package com.example.apptest4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

    lateinit var textViewTypeOrder:TextView
    lateinit var editTextPersonName:TextView
    lateinit var editTextPhone:TextView

    lateinit var buttonBack: Button
    lateinit var buttonCallService: Button
    lateinit var buttonSendOrder:Button

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        textViewTypeOrder = findViewById(R.id.TextViewTitle)
        val keyValue: String? = intent.extras?.getString(TYPE_ORDER_KEY, "NONE")
        textViewTypeOrder.text = keyValue

        editTextPersonName = findViewById(R.id.EditTextPersonName)
        editTextPhone = findViewById(R.id.EditTextPhone)

        buttonBack = findViewById(R.id.buttonBack)
        buttonCallService = findViewById(R.id.buttonCallService)
        buttonSendOrder = findViewById(R.id.buttonSendOrder)


        buttonSendOrder.isEnabled = true
        buttonSendOrder.setOnClickListener {

            val SendEmailIntent = Intent(Intent.ACTION_SENDTO)
            SendEmailIntent.setType("text/html");
            SendEmailIntent.setData(Uri.parse("mailto:service@yahoo.com"))
            //SendEmailIntent.putExtra(Intent.EXTRA_EMAIL, "service@yahoo.com");
            SendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, "Repair order");
            SendEmailIntent.putExtra(Intent.EXTRA_TEXT, "Dear "+editTextPersonName.text.toString()+", we are glad that you have contacted our organization to repair your "+textViewTypeOrder.text.toString()+". Your order has been accepted and the operator will contact you tel: "+editTextPhone.text+" in the near future.");

            var chooser = Intent.createChooser(SendEmailIntent, "Email Send")

            if (SendEmailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(chooser);
            }

        }

            buttonBack.setOnClickListener {
                val BackActivityIntent: Intent = Intent(this, MainActivity::class.java)
                startActivity(BackActivityIntent)
            }

            buttonCallService.setOnClickListener {
                val PhoneNumber = Uri.parse("tel:+79999999999")
                val CallServiceIntent = Intent(Intent.ACTION_CALL, PhoneNumber)
                startActivity(CallServiceIntent)
            }
        }

}