package com.example.playjuego

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.games.*

class Games : AppCompatActivity() {

    var option : String = "No has elegido ninguna opcion"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        /*------------------------------------------------------------------*/

        val checkBox = findViewById(R.id.checkBox) as CheckBox

        if (checkBox.isChecked()){
            option = checkBox.text.toString()
        }

        val fab : FloatingActionButton = findViewById(R.id.fabGames)

        fab.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(getApplicationContext(), option , Toast.LENGTH_LONG).show()
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}