package com.example.andrzejz.kotlinproject.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by Andrzej Z on 7/15/2015.
 */

public class MyAdapterHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    public val textView: TextView?

    init {
        textView = itemView as? TextView
    }

}