package com.example.myshoppinglist

import android.content.ClipData
import android.os.Build
import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val UserList: ArrayList<User>)
    : RecyclerView.Adapter<CustomAdapter.ViewHolder> (){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName=itemView.findViewById(R.id.textViewName) as TextView
        val textViewItems=itemView.findViewById(R.id.textViewItems) as TextView
        val textViewPrice=itemView.findViewById(R.id.textViewPrice) as TextView
        val imageView=itemView.findViewById(R.id.imageView) as ImageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.list_product, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return UserList.size
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user:User=UserList[position]

        holder.textViewName.text=user.name
        holder.textViewItems.text=user.details
        holder.textViewPrice.text=user.price
        holder.imageView.setImageResource(user.image)




    }
}