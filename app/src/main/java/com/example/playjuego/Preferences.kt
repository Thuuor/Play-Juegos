package com.example.playjuego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.SeekBar

class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        val sb = findViewById(R.id.seekBar1) as SeekBar
        val rb = findViewById(R.id.ratingBar1) as RatingBar

        rb.onRatingBarChangeListener = RatingBar.OnRatingBarChangeListener{ ratingBar, rating, fromUser ->
            sb.progress = rating.toInt()
        }

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                rb.rating = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

    }

}