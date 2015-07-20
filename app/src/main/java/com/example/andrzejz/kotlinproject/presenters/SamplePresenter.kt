package com.example.andrzejz.kotlinproject.presenters

import com.example.andrzejz.kotlinproject.views.abstract_views.SampleView

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public class SamplePresenter(receiver: SampleView) : BasePresenter<SampleView>(receiver) {

    public fun askPresenterToDoSomething() {
        receiver?.doSomething()
    }

}