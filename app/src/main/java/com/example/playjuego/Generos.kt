package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class Generos : AppCompatActivity() {
    var option : String = "No has elegido ninguna opcion"
    var checked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.generos)

        val bottomAppBar = findViewById(R.id.bottom_appbar) as BottomAppBar
        bottomAppBar.replaceMenu(R.menu.menu_main)

        val fab : FloatingActionButton = findViewById(R.id.fab)
        val chipGroup = findViewById(R.id.chipGroup) as ChipGroup

        fab.setOnClickListener({Snackbar.make(it,"Movimiento del boton",Snackbar.LENGTH_LONG).show()})

        chipGroup.setOnCheckedChangeListener(object : ChipGroup.OnCheckedChangeListener {

            override fun onCheckedChanged(group: ChipGroup, checkedId: Int) {
                val checkedChip = group.findViewById<Chip>(checkedId)
                option = checkedChip.text as String
                checked = true
            }
        })

        fab.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (checked) {
                    Toast.makeText(getApplicationContext(), option, Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(), option, Toast.LENGTH_LONG).show();
            }
        })
    }
}