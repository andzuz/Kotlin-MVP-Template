package com.example.andrzejz.kotlinproject.views.implementations

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.presenters.SamplePresenter
import com.example.andrzejz.kotlinproject.views.abstract_views.SampleView
import com.example.andrzejz.kotlinproject.views.implementations.BaseViewImpl
import kotlinx.android.synthetic.view_sample.*;
import kotlinx.android.synthetic.activity_main.*;

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public class SampleViewImpl : BaseViewImpl<SamplePresenter>, SampleView {

    public constructor(context: Context) : super(context) {}

    public constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    public constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun afterViews() {
        presenter.askPresenterToDoSomething()
    }

    override fun getLayoutId(): Int {
        return R.layout.view_sample
    }

    override fun onPresenterCreate(): SamplePresenter {
        return SamplePresenter(this)
    }

    override fun doSomething() {
        Log.i("LOG", "LOG")
    }

}
