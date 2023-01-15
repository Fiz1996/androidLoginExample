package com.faisal.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var page_one = findViewById<View>(R.id.imageView)
        page_one.setOnClickListener{
            startActivity(Intent(applicationContext,PageOne::class.java))
        }


    }
}