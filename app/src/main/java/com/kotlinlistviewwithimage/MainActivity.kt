package com.kotlinlistviewwithimage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var imageIdList = arrayOf<Int>(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.a)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.list_item)
        val adapter = CustomAdapter(this, imageIdList)
        listView.adapter = adapter
    }
}
