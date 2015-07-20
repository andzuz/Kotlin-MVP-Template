package com.example.andrzejz.kotlinproject.views.implementations

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.presenters.BasePresenter
import com.example.andrzejz.kotlinproject.views.abstract_views.BaseView

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public abstract class BaseViewImpl<T> : RelativeLayout {

    protected var presenter: T

    init {
        presenter = onPresenterCreate()
    }

    public constructor(context: Context) : super(context) {
        initialize(context)
    }

    public constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize(context)
    }

    public constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initialize(context)
    }

    private fun initialize(context: Context) {
        val inflater: LayoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(getLayoutId(), this)

        afterViews()
    }

    protected abstract fun afterViews()

    protected abstract fun onPresenterCreate(): T

    protected abstract fun getLayoutId(): Int

}