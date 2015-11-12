package com.example.andrzejz.kotlinproject.mvp

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.mvp.MvpActivity
import com.example.andrzejz.kotlinproject.mvp.TableViewContract
import kotlinx.android.synthetic.view_list.recycler
import java.util.*

/**
 * Created by andrzejzuzak on 06/11/15.
 */

abstract class MvpTableActivity<PR, IT, VH: RecyclerView.ViewHolder> : MvpActivity<PR>(), TableViewContract<IT> {

    var adapter: MyAdapter? = null;

    override fun afterViews() {
        setupRecyclerView();
        afterListInit();
    }

    private fun setupRecyclerView() {
        adapter = MyAdapter(this);
        recycler.layoutManager = LinearLayoutManager(this);
        recycler.adapter = adapter;
    }

    override fun getLayoutId(): Int {
        return R.layout.view_list;
    }

    override fun addItems(items: ArrayList<IT>) {
        adapter?.addItems(items);
    }

    override fun clear() {
        adapter?.clear();
    }

    protected abstract fun afterListInit();
    protected abstract fun getViewHolder(): VH?;
    protected abstract fun bindData(item: IT?, holder: VH?);
    protected abstract fun onDataSetChanged(items: ArrayList<IT>?);

    inner class MyAdapter: RecyclerView.Adapter<VH> {

        constructor(context: Context) {
            this.items = ArrayList();
            this.context = context;
        }

        constructor(context: Context, items: ArrayList<IT>?) {
            this.items = items;
            this.context = context;
        }

        var items: ArrayList<IT>?
        var context: Context?;

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): VH? {
            return getViewHolder();
        }

        override fun getItemCount(): Int {
            return items?.size ?: 0
        }

        fun addItems(items: ArrayList<IT>) {
            this.items?.addAll(items);
            notifyDataSetChanged();
            onDataSetChanged(this.items);
        }

        fun clear() {
            this.items?.clear();
            notifyDataSetChanged();
            onDataSetChanged(this.items);
        }

        override fun onBindViewHolder(holder: VH?, position: Int) {
            val item = items?.get(position);
            bindData(item, holder);
        }
    }

}