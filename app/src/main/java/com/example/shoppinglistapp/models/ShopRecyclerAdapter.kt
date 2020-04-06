package com.example.shoppinglistapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglistapp.R
import kotlinx.android.synthetic.main.list_layout.view.*

class ShopRecyclerAdapter(private val shopList: List<ShopList>): RecyclerView.Adapter<ShopRecyclerAdapter.ShopViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ShopViewHolder(itemView)
    }

    override fun getItemCount() = shopList.size

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        val currentItem = shopList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.title

        holder.itemView.setOnClickListener {
            holder.textView.text = "Shopping Item was clicked!"
        }
    }



    class ShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val textView: TextView = itemView.findViewById(R.id.text_view)
    }


}