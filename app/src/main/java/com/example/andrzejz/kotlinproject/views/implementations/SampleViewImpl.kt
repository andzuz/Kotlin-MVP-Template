package com.example.andrzejz.kotlinproject.views.implementations

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.presenters.SamplePresenter
import com.example.andrzejz.kotlinproject.views.conctracts.SampleViewContract
import com.example.andrzejz.kotlinproject.mvp.MvpView
import kotlinx.android.synthetic.view_sample.*;
import kotlinx.android.synthetic.view_sample.view.*;
import kotlinx.android.synthetic.activity_main.*;

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public class SampleViewImpl : MvpView<SamplePresenter>, SampleViewContract {

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
        sample_text.setText("Something")
    }

}
