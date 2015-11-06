package com.example.andrzejz.kotlinproject.activities

import android.util.Log
import com.example.andrzejz.kotlinproject.mvp.MvpTableActivity
import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.presenters.SampleActivityListPresenter
import com.example.andrzejz.kotlinproject.views.rowviews.SampleRowView
import com.example.andrzejz.kotlinproject.views.viewholders.SampleViewHolder
import java.util.*

/**
 * Created by andrzejzuzak on 06/11/15.
 */

class SampleListActivity : MvpTableActivity<SampleActivityListPresenter, IpResponse, SampleViewHolder>() {

    override fun onPresenterCreate(): SampleActivityListPresenter {
        return SampleActivityListPresenter(this)
    }

    override fun onDataSetChanged(items: ArrayList<IpResponse>?) {
        Log.i("DATA", "NOW:"+items?.size());
    }

    override fun bindData(item: IpResponse?, holder: SampleViewHolder?) {
        holder?.setData(item!!);
    }

    override fun getViewHolder(): SampleViewHolder? {
        return SampleViewHolder(SampleRowView(this));
    }

    override fun afterListInit() {
        val sampleItem = IpResponse("SIALALA");
        val list = ArrayList<IpResponse>();
        list.add(sampleItem);
        addItems(list);
    }

}