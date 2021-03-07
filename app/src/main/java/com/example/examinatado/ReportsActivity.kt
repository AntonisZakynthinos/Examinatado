package com.example.examinatado


import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ReportsActivity : AppCompatActivity() {
    lateinit var listview: ListView
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
        listview = findViewById(R.id.listview) as ListView
        val arrayList:ArrayList<String> = ArrayList()

        arrayList.add("10/9/2017")
        arrayList.add("9/6/2017")
        arrayList.add("23/2/2017")
        arrayList.add("3/12/2016")
        arrayList.add("6/8/2016")

        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList)
        listview.setAdapter(arrayAdapter)
    }
}