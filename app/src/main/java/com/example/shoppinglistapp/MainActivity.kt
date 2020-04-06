package com.example.shoppinglistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglistapp.models.ShopList
import com.example.shoppinglistapp.models.ShopRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shopList = generateDummyList(250)

        recycler_view.adapter = ShopRecyclerAdapter(shopList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<ShopList> {

        val list = ArrayList<ShopList>()

        for (i in 0 until size) {
            val drawable = R.drawable.ic_shop

            val item = ShopList(drawable, "Shopping Item $i")
            list += item
        }

        return list
    }
}
