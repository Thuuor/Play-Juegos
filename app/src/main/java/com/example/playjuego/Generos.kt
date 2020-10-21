package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class Generos : AppCompatActivity() {
    var option : String = "No has elegido ninguna opcion"

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
                option = checkedChip.text.toString()
                Toast.makeText(applicationContext,option,Toast.LENGTH_LONG).show()
            }


        })

        val items = ArrayList<Tarjeta>()
        items.add(Tarjeta(R.string.note1))
        items.add(Tarjeta(R.string.note2))
        items.add(Tarjeta(R.string.note3))
        items.add(Tarjeta(R.string.note4))
        items.add(Tarjeta(R.string.note5))
        items.add(Tarjeta(R.string.note6))
        items.add(Tarjeta(R.string.note7))
        items.add(Tarjeta(R.string.note8))
        items.add(Tarjeta(R.string.note9))
        items.add(Tarjeta(R.string.note9))
        items.add(Tarjeta(R.string.note9))
        items.add(Tarjeta(R.string.note9))

        val recView = findViewById<RecyclerView>(R.id.recyclerView)

        recView.setHasFixedSize(true)

        val adaptador = CardsAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        adaptador.onClick = {
            Toast.makeText(this@Generos, items.get(recView.getChildAdapterPosition(it)).cadena, Toast.LENGTH_LONG).show()
        }
    }
}
