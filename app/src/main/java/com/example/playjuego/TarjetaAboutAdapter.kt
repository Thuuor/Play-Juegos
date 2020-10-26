package com.example.playjuego

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TarjetaAboutAdapter(var items: ArrayList<TarjetaAbout>) : RecyclerView.Adapter<TarjetaAboutAdapter.TarjAboutViewHolder>() {
    lateinit var onClick: (View) -> Unit

    init {
        this.items = items
    }

    class TarjAboutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var image: ImageView
        private var tittle: TextView
        private var year: TextView

        init {
            image = itemView.findViewById(R.id.imageItemView)
            tittle = itemView.findViewById(R.id.text1ItemView)
            year = itemView.findViewById(R.id.text2ItemView)
        }

        fun bindTarjeta(t: TarjetaAbout, onClick: (View) -> Unit) = with(itemView) {
            tittle.setText(t.nameTitleAbout)
            image.setImageResource(t.image)
            year.setText(t.year)

            setOnClickListener { onClick(itemView) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjAboutViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item, viewGroup, false)
        return TarjAboutViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: TarjAboutViewHolder, pos: Int) {
        val item = items.get(pos)
        viewHolder.bindTarjeta(item, onClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}