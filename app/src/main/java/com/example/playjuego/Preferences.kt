package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Preferences : AppCompatActivity() {

    var option : String = "No has pulsado ninguna opcion"
    var score:kotlin.String? = ""
    var checked = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        val sb = findViewById(R.id.seekBar1) as SeekBar
        val rb = findViewById(R.id.ratingBar1) as RatingBar
        val fabpref : FloatingActionButton = findViewById(R.id.fabpref)
        val rGroup = findViewById(R.id.radioGroup) as RadioGroup


        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                rb.rating = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        rGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener {

            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                val checkedRadioButton = rGroup.findViewById<RadioButton>(checkedId)
                option = checkedRadioButton.text as String
                checked = true
            }
        })

        rb.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener{
                ratingBar, rating, fromUser ->  sb.progress = rating.toInt()
            }


        fabpref.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                if (checked){
                    score = " La puntuacion que le has dado al juego " + option + " es de " + sb.progress
                    Toast.makeText(getApplicationContext(), score , Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), option , Toast.LENGTH_LONG).show();
                }

            }

        })


    }

}