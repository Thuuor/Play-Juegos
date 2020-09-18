package com.example.playjuego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = findViewById(R.id.button2) as Button
        player.setOnClickListener {
            lanzarNewPlayer()
        }
    }

    fun lanzarNewPlayer(){
        val i = Intent(this,Newplayer::class.java)
        startActivity(i)
    }
}