package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lifecycle", "MainActivity: onCreate()")
        Toast.makeText(this, "MainActivity: onCreate()", Toast.LENGTH_SHORT).show()

        val firstNameEditText = findViewById<EditText>(R.id.editTextFirstName)
        val lastNameEditText = findViewById<EditText>(R.id.editTextLastName)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val submitButton = findViewById<Button>(R.id.buttonSubmit)

        submitButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val email = emailEditText.text.toString()

            val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
            if (!email.matches(emailPattern.toRegex())) {
                Toast.makeText(this, "Невірний формат електронної пошти", Toast.LENGTH_SHORT).show()
            } else if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Будь ласка, заповніть всі поля", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("first_name", firstName)
                    putExtra("last_name", lastName)
                    putExtra("email", email)
                }
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "MainActivity: onStart()")
        Toast.makeText(this, "MainActivity: onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "MainActivity: onResume()")
        Toast.makeText(this, "MainActivity: onResume()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "MainActivity: onPause()")
        Toast.makeText(this, "MainActivity: onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "MainActivity: onStop()")
        Toast.makeText(this, "MainActivity: onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "MainActivity: onDestroy()")
        Toast.makeText(this, "MainActivity: onDestroy()", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_help -> {
                val intent = Intent(this, HelpActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}