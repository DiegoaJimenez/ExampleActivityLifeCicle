package com.example.exampleactivitylifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("this in the onCreated")
        Log.d("TAGLIFECYVLE","THIS IS THE ONCREATED")
    }
}