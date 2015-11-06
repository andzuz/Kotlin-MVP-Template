package com.example.andrzejz.kotlinproject.extensions

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.andrzejz.kotlinproject.mvp.MvpPresenter
import com.example.andrzejz.kotlinproject.mvp.ViewContract
import com.example.andrzejz.kotlinproject.singletons.ApiController
import com.example.andrzejz.kotlinproject.network.traits.ApiService
import com.example.andrzejz.kotlinproject.singletons.Constants

/**
 * Created by Andrzej Z on 7/15/2015.
 */

fun AppCompatActivity.showSnackBar(text: String, view: View) {
    Snackbar
        .make(view, text, Snackbar.LENGTH_SHORT)
        .show()
}