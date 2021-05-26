package com.example.srien5exercice1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_act_2.setOnClickListener {

            val color :String = intent.extras?.get("color").toString()

            var intent = Intent(this, SettingActivity::class.java)
             startActivity(intent)
        }
    }
}
