package com.example.andrzejz.kotlinproject.activities

import android.util.Log
import android.view.MenuItem
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.mvp.MvpDrawerActivity
import com.example.andrzejz.kotlinproject.presenters.SamplePresenter
import com.example.andrzejz.kotlinproject.views.conctracts.SampleViewContract

/**
 * Created by andrzejzuzak on 10/11/15.
 */

class SampleDrawerActivity : MvpDrawerActivity<SamplePresenter>(), SampleViewContract {

    override fun doSomething() {
//        throw UnsupportedOperationException()
    }

    override fun onPresenterCreate(): SamplePresenter {
        return SamplePresenter(this)
    }

    override fun getLayoutId(): Int {
        return R.layout.sample_drawer_layout
    }

    override fun onDrawerItemPressed(item: MenuItem?): Boolean {
        Log.i("DRAWER", item?.title as String?)
        return true
    }

    override fun onBackButtonPressed() {
        Log.i("DRAWER", "back")
    }

}