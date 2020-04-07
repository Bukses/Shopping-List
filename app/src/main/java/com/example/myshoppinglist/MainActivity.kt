package com.example.myshoppinglist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById(R.id.shoppingList) as RecyclerView

        shoppingList.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users=ArrayList<User>()

        users.add(User("Apples", "3 crates", price = "$50", image = R.drawable.image_1 ))
        users.add(User("Beef", "1 carton", price = "$30", image = R.drawable.image_2 ))
        users.add(User("Onions", "1 bag", price = "$5", image = R.drawable.image_3 ))
        users.add(User("Frozen Fish", "2 packs", price = "$20", image = R.drawable.image_4 ))
        users.add(User("Detergent", "1 pack", price = "$15", image = R.drawable.image_5 ))
        users.add(User("Electric Kettle", "1 piece", price = "$8", image = R.drawable.image_6 ))
        users.add(User("Chocolates", "4 packs", price = "$15", image = R.drawable.image_7 ))
        users.add(User("Pepper", "3 crates", price = "$30", image = R.drawable.image_8 ))
        users.add(User("Jacket", "2 pieces", price = "$50", image = R.drawable.image_9 ))
        users.add(User("Toiletries", "1 set", price = "$30", image = R.drawable.image_0 ))




        val adapter=CustomAdapter(users)


        recyclerView.adapter=adapter

    }

}
