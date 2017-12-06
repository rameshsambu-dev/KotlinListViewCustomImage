package com.kotlinlistviewwithimage

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

/**
 * Created by Lenovo on 12/06/2017.
 */
class CustomAdapter(private val context: Activity, imageIdList: Array<Int>) : BaseAdapter() {
    val imageIdList:Array<Int> = imageIdList
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.my_list, null)
        val imageView = rowView.findViewById<ImageView>(R.id.image_item)
        imageView.setImageResource(imageIdList[p0])
        return rowView
    }

    override fun getItem(p0: Int): Any {
        return imageIdList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return imageIdList.size
    }
}