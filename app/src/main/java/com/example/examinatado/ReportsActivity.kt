package com.example.examinatado


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ReportsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reports)
        findViewById<Button>(R.id.HomeButton2).setOnClickListener {
            val i = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(R.id.ProfileButton2).setOnClickListener {
            val i = Intent(applicationContext, ProfileActivity::class.java)
            startActivity(i)
        }
    }
}