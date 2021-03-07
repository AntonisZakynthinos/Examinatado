package com.example.examinatado

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.examinatado.R.id.ReportsButton3

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        findViewById<Button>(R.id.HomeButton3).setOnClickListener {
            val i = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
        }
        findViewById<Button>(ReportsButton3).setOnClickListener {
            val i = Intent(applicationContext, ReportsActivity::class.java)
            startActivity(i)
        }
    }
}