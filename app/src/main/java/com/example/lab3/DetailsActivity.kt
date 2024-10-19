package com.example.lab3

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        Log.d("Lifecycle", "DetailsActivity: onCreate()")
        Toast.makeText(this, "DetailsActivity: onCreate()", Toast.LENGTH_SHORT).show()

        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")
        val email = intent.getStringExtra("email")

        val detailsTextView = findViewById<TextView>(R.id.textViewDetails)
        detailsTextView.text = "Ім'я: $firstName\nПрізвище: $lastName\nЕлектронна пошта: $email"
    }

    override fun onStart() {
        super.onStart()
        Log.d("DetailsActivity", "onStart called")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("DetailsActivity", "onResume called")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("DetailsActivity", "onPause called")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("DetailsActivity", "onStop called")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DetailsActivity", "onDestroy called")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}