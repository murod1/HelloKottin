package com.example.hellokottin0427

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJAVA =findViewById<Button>(R.id.BtnJava)
        val btnKOTLIN =findViewById<Button>(R.id.BtnKotlin)
        var intent : Intent



        btnJAVA.setOnClickListener{
            intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(intent)
        }

        btnKOTLIN.setOnClickListener{
            intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
            startActivity(intent)
        }
    }

}

