package com.example.andrzejz.kotlinproject.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.example.andrzejz.kotlinproject.R
import kotlinx.android.synthetic.activity_main.main_container
import kotlinx.android.synthetic.activity_main.toolbar

/**
 * Created by andrzejzuzak on 06/11/15.
 */

abstract class MvpActivity<T> : AppCompatActivity() {

    protected var presenter: T

    init {
        presenter = onPresenterCreate()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        afterViews()
    }

    protected abstract fun afterViews()

    protected abstract fun onPresenterCreate(): T

    protected abstract fun getLayoutId(): Int

}