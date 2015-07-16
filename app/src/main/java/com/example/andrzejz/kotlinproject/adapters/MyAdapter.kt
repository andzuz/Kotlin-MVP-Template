package com.example.andrzejz.kotlinproject.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.holders.MyAdapterHolder
import java.util.*

/**
 * Created by Andrzej Z on 7/15/2015.
 */

public class MyAdapter(items: ArrayList<String>?) : RecyclerView.Adapter<MyAdapterHolder>() {

    val items: ArrayList<String>?

    init {
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyAdapterHolder? {
        val view = LayoutInflater
                        .from(parent?.getContext())
                        .inflate(R.layout.simple_list_item, parent, false)
        return MyAdapterHolder(view)
    }

    override fun getItemCount(): Int {
        return items?.size() ?:0
    }

    override fun onBindViewHolder(holder: MyAdapterHolder?, position: Int) {
        holder?.textView?.setText(items?.get(position))
    }

}