package com.example.andrzejz.kotlinproject.mvp

import com.example.andrzejz.kotlinproject.mvp.ViewContract
import com.example.andrzejz.kotlinproject.mvp.MvpView
import com.example.andrzejz.kotlinproject.singletons.ApiController

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public abstract class MvpPresenter<T : ViewContract>(receiver: T) {

    protected var receiver: T? = receiver
    protected val api = ApiController.api

    public fun clear() {
        receiver = null
    }

}