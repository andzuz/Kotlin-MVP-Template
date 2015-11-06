package com.example.andrzejz.kotlinproject.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.extensions.showSnackBar
import com.example.andrzejz.kotlinproject.singletons.ApiController
import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.singletons.Constants
import com.example.andrzejz.kotlinproject.singletons.DataProvider
import com.example.andrzejz.kotlinproject.views.implementations.SampleListImpl
import com.example.andrzejz.kotlinproject.views.implementations.SampleViewImpl
import kotlinx.android.synthetic.activity_main.*;
import kotlinx.android.synthetic.view_sample.*;
import retrofit.Callback
import retrofit.RetrofitError
import retrofit.client.Response

public abstract  class MvpContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar as Toolbar)
        main_container.showView(getInitialView())
    }

    abstract fun getInitialView(): ViewGroup

    fun changeView(newView: ViewGroup) {
        main_container.showView(newView)
    }

}