package com.example.andrzejz.kotlinproject.views.implementations

import android.content.Context
import android.util.Log
import com.example.andrzejz.kotlinproject.mvp.MvpTableView
import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.presenters.SampleListPresenter
import com.example.andrzejz.kotlinproject.presenters.SamplePresenter
import com.example.andrzejz.kotlinproject.views.rowviews.SampleRowView
import com.example.andrzejz.kotlinproject.views.viewholders.SampleViewHolder
import java.util.*

/**
 * Created by andrzejzuzak on 22/10/15.
 */

class SampleListImpl(context: Context) : MvpTableView<SampleListPresenter, IpResponse, SampleViewHolder>(context) {

    override fun afterListInit() {
        val sampleItem = IpResponse("SIALALA");
        val list = ArrayList<IpResponse>();
        list.add(sampleItem);
        addItems(list);
    }

    override fun getViewHolder(): SampleViewHolder? {
        return SampleViewHolder(SampleRowView(context));
    }

    override fun bindData(item: IpResponse?, holder: SampleViewHolder?) {
        holder?.setData(item!!);
    }

    override fun onDataSetChanged(items: ArrayList<IpResponse>?) {
        Log.i("DATA", "NOW:"+items?.size());
    }

    override fun onPresenterCreate(): SampleListPresenter {
        return SampleListPresenter(this);
    }

}