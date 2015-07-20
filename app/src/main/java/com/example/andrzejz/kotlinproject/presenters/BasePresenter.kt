package com.example.andrzejz.kotlinproject.presenters

import com.example.andrzejz.kotlinproject.views.abstract_views.BaseView
import com.example.andrzejz.kotlinproject.views.implementations.BaseViewImpl

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public abstract class BasePresenter<T : BaseView>(receiver: T) {

    protected var receiver: T? = receiver

    public fun clear() {
        receiver = null
    }

}