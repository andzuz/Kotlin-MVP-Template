package com.example.andrzejz.kotlinproject

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import com.example.andrzejz.kotlinproject.adapters.MyAdapter
import com.example.andrzejz.kotlinproject.extensions.getApi
import com.example.andrzejz.kotlinproject.extensions.showSnackBar
import com.example.andrzejz.kotlinproject.network.api.Api
import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.singletons.Constants
import com.example.andrzejz.kotlinproject.singletons.DataProvider
import kotlinx.android.synthetic.activity_main.*;
import org.jetbrains.anko.alert
import org.jetbrains.anko.intentFor
import retrofit.Callback
import retrofit.RetrofitError
import retrofit.client.Response

public class MainActivity : ActionBarActivity(), Callback<IpResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super<ActionBarActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUi();
    }

    private fun setupUi() {
        setupListeners()
        setupRecyclerView();
    }

    private val myAdapter = MyAdapter(DataProvider.dataList)

    private fun setupRecyclerView() {
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(myAdapter)
        myAdapter.notifyDataSetChanged()
    }

    private fun setupListeners() {
        clickMeButton.setOnClickListener {
            showSnackBar("Clicked!", rootLayout)
            getApi().getGoogle(this@MainActivity)
        }
    }

    override fun failure(error: RetrofitError?) {
        throw UnsupportedOperationException()
    }

    override fun success(t: IpResponse?, response: Response?) {
        t?.let {
            alert("Warning", "Do you want to launch SecAct?") {
                positiveButton("Yes") {
                    val ip: String? = t?.ip
                    startActivity(intentFor<SecondActivity>(Constants.ARG_EXTRA to ip!!))
                }

                negativeButton("Hell no!") {}
            }.show()
        }
    }

}
