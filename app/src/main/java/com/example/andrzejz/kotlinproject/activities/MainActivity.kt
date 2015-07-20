package com.example.andrzejz.kotlinproject.activities

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import com.example.andrzejz.kotlinproject.R
import com.example.andrzejz.kotlinproject.adapters.MyAdapter
import com.example.andrzejz.kotlinproject.extensions.getApi
import com.example.andrzejz.kotlinproject.extensions.showSnackBar
import com.example.andrzejz.kotlinproject.network.api.ApiController
import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.singletons.Constants
import com.example.andrzejz.kotlinproject.singletons.DataProvider
import com.example.andrzejz.kotlinproject.views.implementations.SampleViewImpl
import kotlinx.android.synthetic.activity_main.*;
import kotlinx.android.synthetic.view_sample.*;
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor
import retrofit.Callback
import retrofit.RetrofitError
import retrofit.client.Response

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar as Toolbar)
        main_container.showView(SampleViewImpl(this))
    }

}

//    private val callback = object : Callback<IpResponse>
//    {
//        override fun success(t: IpResponse?, response: Response?) {
//            t?.let {
//                alert("Warning", "Do you want to launch SecAct?") {
//                    positiveButton("Yes") {
//                    }
//
//                    negativeButton("Hell no!") {}
//                }.show()
//            }
//        }
//
//        override fun failure(error: RetrofitError?) {
//            throw UnsupportedOperationException()
//        }
//


//    }

//    private fun setupRecyclerView() {
//        recyclerView.setLayoutManager(LinearLayoutManager(this))
//        recyclerView.setAdapter(myAdapter)
//        myAdapter.notifyDataSetChanged()
//    }