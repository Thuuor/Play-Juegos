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

    private var checkBoxs = arrayListOf<CheckBox>()
    private var checkNames = arrayListOf<String>()
    private var result: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        checkBoxs.add(findViewById(R.id.checkBox))
        checkBoxs.add(findViewById(R.id.checkBox2))
        checkBoxs.add(findViewById(R.id.checkBox3))
        checkBoxs.add(findViewById(R.id.checkBox4))
        checkBoxs.add(findViewById(R.id.checkBox5))
        checkBoxs.add(findViewById(R.id.checkBox6))


        val fab: FloatingActionButton = findViewById(R.id.fabGames)
        fab.setOnClickListener()
        {
            for (item in checkBoxs) {
                if (item.isChecked)
                    checkNames.add(item.text.toString())
            }

            if (checkNames.size == 0) {
                result = "No has seleccionado nada"
            } else {
                for (i in checkNames.indices) {
                    if (i == 0) {
                        result = "Has seleccionado " + checkNames[0]
                    } else if (i == checkNames.size - 1) {
                        result += " y " + checkNames[i]
                    } else {
                        result += ", " + checkNames[i]
                    }
                }
            }
            Toast.makeText(applicationContext, result, Toast.LENGTH_LONG).show()
            checkNames.clear()
        }

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}