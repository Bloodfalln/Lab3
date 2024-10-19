package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("Lifecycle", "SecondActivity: onCreate()")
        Toast.makeText(this, "SecondActivity: onCreate()", Toast.LENGTH_SHORT).show()

        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")
        val email = intent.getStringExtra("email")

        val greetingTextView = findViewById<TextView>(R.id.textViewGreeting)
        greetingTextView.text = "Вітаємо, $firstName $lastName!\nВаша пошта: $email"

        val detailsButton = findViewById<Button>(R.id.buttonDetails)
        detailsButton.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("first_name", firstName)
                putExtra("last_name", lastName)
                putExtra("email", email)
            }
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStart called")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResume called")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPause called")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStop called")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy called")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }

}