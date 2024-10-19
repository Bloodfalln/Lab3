package com.example.lab3

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        Log.d("Lifecycle", "HelpActivity: onCreate()")
        Toast.makeText(this, "HelpActivity: onCreate()", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "HelpActivity: onStart()")
        Toast.makeText(this, "HelpActivity: onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "HelpActivity: onResume()")
        Toast.makeText(this, "HelpActivity: onResume()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "HelpActivity: onPause()")
        Toast.makeText(this, "HelpActivity: onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "HelpActivity: onStop()")
        Toast.makeText(this, "HelpActivity: onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "HelpActivity: onDestroy()")
        Toast.makeText(this, "HelpActivity: onDestroy()", Toast.LENGTH_SHORT).show()
    }
}