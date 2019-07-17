package com.example.simplerecyclerviewfm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val list:ArrayList<CarModel>):RecyclerView.Adapter<CarAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val item_img:ImageView=itemView.findViewById(R.id.item_img)
        val item_tv:TextView=itemView.findViewById(R.id.item_tv)

        fun bindItems(item: CarModel) {
            item_img.setImageResource(item.carImg)
            item_tv.text = item.carDesc
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view =LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

}