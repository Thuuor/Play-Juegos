package com.example.playjuego

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = findViewById(R.id.button2) as Button
        player.setOnClickListener {
            lanzarNewPlayer()
        }

        val pref = findViewById(R.id.button3) as Button
        pref.setOnClickListener {
            lanzarPreferences()
        }

        val games = findViewById(R.id.button1) as Button
        games.setOnClickListener{
            lanzarGames()
        }

        val titulo = findViewById(R.id.titulo) as TextView
        titulo.setTypeface(Typeface.createFromAsset(assets, "Courgette-Regular.ttf"))

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }

    fun lanzarGames(){
        val i = Intent(this,Games::class.java)
        startActivity(i)
    }

    fun lanzarNewPlayer(){
        val i = Intent(this,Newplayer::class.java)
        startActivity(i)
    }

    fun lanzarGenero(){
        val i = Intent(this,Generos::class.java)
        startActivity(i)
    }

    fun lanzarPreferences(){
        val i = Intent(this,Preferences::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {  (R.id.action_search) -> {lanzarGenero()}
            (R.id.action_add) -> {return true}
            else -> {return super.onOptionsItemSelected(item)}
        }
        return true
    }
}