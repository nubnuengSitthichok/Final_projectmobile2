package com.example.hitthemole.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hitthemole.R
import com.example.hitthemole.data.MyData



class toptenadapter : RecyclerView.Adapter<toptenadapter.ViewHolder>(){
    var data = listOf<MyData>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.image2.setImageResource(R.drawable.anim_bg)
//        holder.image3.setImageResource(R.drawable.amily)
        holder.text1.text = data[position].name
        holder.text2.text = data[position].detail
//        holder.sourceTextView.text = _data[position].source
    }

    fun replaceItems(items: List<MyData>) {
        this.data = items
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        //val image1: ImageView = itemView.findViewById(R.id.imageView3)
        //val image2: ImageView = itemView.findViewById(R.id.imageView3)
        //val image3: ImageView = itemView.findViewById(R.id.imageView3)
        val text1: TextView = itemView.findViewById(R.id.textView2)
        val text2: TextView = itemView.findViewById(R.id.textView3)

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.name_item, parent, false)

                return ViewHolder(view)
            }
        }
    }
}