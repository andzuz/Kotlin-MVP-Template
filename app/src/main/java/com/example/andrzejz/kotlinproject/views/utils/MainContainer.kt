package com.example.andrzejz.kotlinproject.views.utils

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.andrzejz.kotlinproject.views.implementations.BaseView

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public class MainContainer : FrameLayout {

    public constructor(context: Context) : super(context) {}

    public constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    public constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    public fun showView(view: ViewGroup) {
        removeAllViews()
        addView(view)
    }

}