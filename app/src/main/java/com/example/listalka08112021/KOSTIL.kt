package com.example.listalka08112021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class KOSTIL : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kostil)
        startActivity(Intent(this,MainActivity2::class.java))
    }
}