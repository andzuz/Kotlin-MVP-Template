package com.example.andrzejz.kotlinproject.activities

import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.mvp.MvpActivity
import com.example.andrzejz.kotlinproject.presenters.SamplePresenter
import com.example.andrzejz.kotlinproject.views.conctracts.SampleViewContract

/**
 * Created by andrzejzuzak on 06/11/15.
 */

class SampleActivity : MvpActivity<SamplePresenter>(), SampleViewContract {

    override fun doSomething() {

    }

    override fun onPresenterCreate(): SamplePresenter {
        return SamplePresenter(this)
    }

    override fun afterViews() {
        presenter.askPresenterToDoSomething()
    }

    override fun getLayoutId(): Int {
        return R.layout.view_sample;
    }

}