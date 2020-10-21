package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class Newplayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newplayer)

        val telefonos = arrayOf("Telefono 1","Telefono 2","Telefono 3")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)

        val lista_tlf = findViewById(R.id.spinner) as Spinner

        val tlf_textView = findViewById(R.id.textPhone) as TextView

        lista_tlf.adapter = adaptador

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        lista_tlf.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tlf_textView.setText(parent?.getItemAtPosition(position).toString())
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        })
    }


}