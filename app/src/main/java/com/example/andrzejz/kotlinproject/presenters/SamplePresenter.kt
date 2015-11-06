package com.example.andrzejz.kotlinproject.presenters

import android.util.Log
import android.widget.Toast
import com.example.andrzejz.kotlinproject.mvp.MvpPresenter
import com.example.andrzejz.kotlinproject.singletons.ApiController
import com.example.andrzejz.kotlinproject.views.conctracts.SampleViewContract
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by Andrzej Z on 7/20/2015.
 */

public class SamplePresenter(receiver: SampleViewContract) : MvpPresenter<SampleViewContract>(receiver) {

    public fun askPresenterToDoSomething() {
        api.getGoogle()
            .subscribe(
                { Log.i("IP", it.ip) },
                { Log.i("ERROR", it.getMessage()) }
            )
    }

}