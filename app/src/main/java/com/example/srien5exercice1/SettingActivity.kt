package com.example.srien5exercice1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        var intent2 = Intent(this, MainActivity::class.java)


        col1.setOnClickListener {
            layoutsetting.setBackgroundColor(Color.RED)
            //mainlayout.setBackgroundColor(Color.RED)
        }
        col2.setOnClickListener {
            layoutsetting.setBackgroundColor(Color.BLUE)
            //mainlayout.setBackgroundColor(Color.BLUE)
        }
        col3.setOnClickListener {
            layoutsetting.setBackgroundColor(Color.GREEN)
            //mainlayout.setBackgroundColor(Color.GREEN)
        }
        back.setOnClickListener {
            startActivity(intent2)
        }
    }
}
