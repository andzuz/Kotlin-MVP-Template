package com.example.andrzejz.kotlinproject.views.rowviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

/**
 * Created by andrzejzuzak on 22/10/15.
 */

abstract class BaseRowView<IT>: RelativeLayout {

    public constructor(context: Context) : super(context) {
        init(context);
    }

    private fun init(context: Context) {
        val viewLayout = getRowLayoutId();
        LayoutInflater.from(context).inflate(viewLayout, this, true);
        findViews();
    }

    public constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context);
    }

    public constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context);
    }

    abstract fun findViews();
    abstract fun getRowLayoutId(): Int;
    abstract fun setData(item: IT);

}