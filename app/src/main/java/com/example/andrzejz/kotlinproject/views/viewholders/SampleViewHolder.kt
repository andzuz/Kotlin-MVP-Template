package com.example.andrzejz.kotlinproject.views.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.views.rowviews.SampleRowView

/**
 * Created by andrzejzuzak on 22/10/15.
 */

class SampleViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    fun setData(item: IpResponse) {
        (itemView as SampleRowView).setData(item);
    }

}