package com.example.andrzejz.kotlinproject.extensions

import android.support.design.widget.Snackbar
import android.support.v7.app.ActionBarActivity
import android.view.View
import com.example.andrzejz.kotlinproject.SecondActivity
import com.example.andrzejz.kotlinproject.network.api.Api
import com.example.andrzejz.kotlinproject.network.traits.FakeApi
import com.example.andrzejz.kotlinproject.singletons.Constants
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor

/**
 * Created by Andrzej Z on 7/15/2015.
 */

fun ActionBarActivity.showSnackBar(text: String, view: View) {
    Snackbar
        .make(view, text, Snackbar.LENGTH_SHORT)
        .show()
}

fun ActionBarActivity.getApi(): FakeApi {
    return Api.api
}