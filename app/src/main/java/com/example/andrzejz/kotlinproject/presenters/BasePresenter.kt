package com.example.andrzejz.kotlinproject.presenters

import com.example.andrzejz.kotlinproject.views.abstract_views.ViewContract
import com.example.andrzejz.kotlinproject.views.implementations.BaseView

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public abstract class BasePresenter<T : ViewContract>(receiver: T) {

    protected var receiver: T? = receiver

    public fun clear() {
        receiver = null
    }

}