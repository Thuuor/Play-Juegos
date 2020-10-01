package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomappbar.BottomAppBar

class Generos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.generos)

        val bottomAppBar = findViewById(R.id.bottom_appbar) as BottomAppBar
        bottomAppBar.replaceMenu(R.menu.menu_main)
    }
}