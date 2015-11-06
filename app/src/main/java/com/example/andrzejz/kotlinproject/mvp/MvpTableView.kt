package com.example.andrzejz.kotlinproject.mvp

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.ViewGroup
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.mvp.MvpView
import com.example.andrzejz.kotlinproject.mvp.TableViewContract
import kotlinx.android.synthetic.view_list.view.recycler;
import java.util.*

/**
 * Created by andrzejzuzak on 22/10/15.
 */

public abstract class MvpTableView<PR, IT, VH: RecyclerView.ViewHolder>: MvpView<PR>, TableViewContract<IT> {

    var adapter: MyAdapter? = null;

    public constructor(context: Context) : super(context) {}

    public constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    public constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun afterViews() {
        setupRecyclerView();
        afterListInit();
    }

    private fun setupRecyclerView() {
        adapter = MyAdapter(context);
        recycler.layoutManager = LinearLayoutManager(context);
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
            return items?.size() ?: 0
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