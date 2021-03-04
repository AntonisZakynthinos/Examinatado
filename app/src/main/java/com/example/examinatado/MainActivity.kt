package com.example.examinatado

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Vibrator
import android.os.VibrationEffect
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    //val vibe = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.scanButton).setOnClickListener {

            val i = Intent(applicationContext, ScanActivity::class.java)
            startActivity(i)
        }


    }

    fun showTip(View: View)
    {
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        //{
        //    vibe.vibrate(VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE))
        //}
        //else
        //{
        //deprecated in API 26
        //vibe.vibrate(80)
        //}
        Toast.makeText(applicationContext, "Brain Tip", Toast.LENGTH_LONG).show()
    }

    fun showTip1(view: View)
    {
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        //{
        //    vibe.vibrate(VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE))
        //}
        //else
        //{
        //deprecated in API 26
        //vibe.vibrate(80)
        //}
        Toast.makeText(applicationContext, "Colon Tip", Toast.LENGTH_LONG).show()
    }

    fun showTip2(view: View)
    {
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        //{
        //    vibe.vibrate(VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE))
        //}
        //else
        //{
        //deprecated in API 26
        //vibe.vibrate(80)
        //}
        Toast.makeText(applicationContext, "Heart Tip", Toast.LENGTH_LONG).show()
    }

    fun showTip4(view: View)
    {
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        //{
        //    vibe.vibrate(VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE))
        //}
        //else
        //{
        //deprecated in API 26
        //vibe.vibrate(80)
        //}
        Toast.makeText(applicationContext, "Liver Tip", Toast.LENGTH_LONG).show()
    }

    fun showTip5(view: View)
    {
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        //{
        //    vibe.vibrate(VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE))
        //}
        //else
        //{
        //deprecated in API 26
        //vibe.vibrate(80)
        //}
        Toast.makeText(applicationContext, "Lungs Tip", Toast.LENGTH_LONG).show()
    }

    fun showTip6(view: View)
    {
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        //{
        //    vibe.vibrate(VibrationEffect.createOneShot(80, VibrationEffect.DEFAULT_AMPLITUDE))
        //}
        //else
        //{
            //deprecated in API 26
            //vibe.vibrate(80)
        //}
        Toast.makeText(applicationContext, "Small Intestine Tip", Toast.LENGTH_LONG).show()
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}