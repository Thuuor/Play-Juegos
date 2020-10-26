package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)


        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val items = ArrayList<TarjetaAbout>()
        items.add(TarjetaAbout(R.drawable.image1,"Patrick","1995"))
        items.add(TarjetaAbout(R.drawable.image2,"Javier","1998"))
        items.add(TarjetaAbout(R.drawable.image3,"Carlos","2015"))
        items.add(TarjetaAbout(R.drawable.image4,"Berta","2000"))
        items.add(TarjetaAbout(R.drawable.image5,"Hector","1599"))
        items.add(TarjetaAbout(R.drawable.image6,"Ismael","2145"))
        items.add(TarjetaAbout(R.drawable.image7,"Roberto","125"))
        items.add(TarjetaAbout(R.drawable.image8,"Rico","685"))

        val recView = findViewById<RecyclerView>(R.id.recyclerViewAbout)

        recView.setHasFixedSize(true)

        val adaptador = TarjetaAboutAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        adaptador.onClick = {
            Toast.makeText(this@About, items.get(recView.getChildAdapterPosition(it)).nameTitleAbout, Toast.LENGTH_LONG).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}