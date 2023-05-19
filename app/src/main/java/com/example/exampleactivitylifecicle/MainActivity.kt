package com.example.exampleactivitylifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("this in the onCreated")
        val b = findViewById<Button>(R.id.button)
        b.setOnClickListener { showImage() }

        //show files dir
        showFilesDir()
        Log.d("TAGLIFECYVLE","THIS IS THE ONCREATED")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAGLIFECYVLE","THIS IS THE ONSTART")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGLIFECYVLE","THIS IS THE ONSTOP")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAGLIFECYVLE","THIS IS THE ONPAUSE")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAGLIFECYVLE","THIS IS THE ONRESUME")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGLIFECYVLE","THIS IS THE ONDESTROY")
    }

    fun showImage(){
        val iv = findViewById<ImageView>(R.id.imageView)
        iv.setImageResource(R.drawable.bayern)
    }

    fun showFilesDir(){
        Log.d("TAGFILES","Absolute path ${filesDir.absolutePath}")
        Log.d("TAGFILES","is a directory ${filesDir.isDirectory}")

    }
}