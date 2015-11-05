package com.example.andrzejz.kotlinproject.views.rowviews

import android.content.Context
import android.widget.TextView
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.network.models.IpResponse

/**
 * Created by andrzejzuzak on 22/10/15.
 */

class SampleRowView(context: Context) : BaseRowView<IpResponse>(context) {

    var text: TextView? = null;

    override fun findViews() {
        text = findViewById(R.id.text) as TextView?;
    }

    override fun getRowLayoutId(): Int {
        return R.layout.sample_list_row;
    }

    override fun setData(item: IpResponse) {
        text?.text = item.ip;
    }

}