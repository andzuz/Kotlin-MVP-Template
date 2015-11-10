package com.example.andrzejz.kotlinproject.mvp

import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.andrzejz.kotlinproject.R

/**
 * Created by andrzejzuzak on 10/11/15.
 */

abstract class MvpDrawerActivity<T> : MvpActivity<T>(), NavigationView.OnNavigationItemSelectedListener {

    override fun onNavigationItemSelected(p0: MenuItem?): Boolean {
        p0?.setChecked(true)
        return onDrawerItemPressed(p0)
    }

    var toolbar: Toolbar? = null
    var navigationView: NavigationView? = null
    var drawerLayout: DrawerLayout? = null

    override fun afterViews() {
        initNavigationView()
    }

    private fun initNavigationView() {
        toolbar = findViewById(R.id.toolbar) as Toolbar? ?: throw RuntimeException("MvpDrawerActivity must have Toolbar in xml!")
        navigationView = findViewById(R.id.navigationView) as NavigationView? ?: throw RuntimeException("MvpDrawerActivity must have NavigationView in xml!")
        drawerLayout = findViewById(R.id.drawerLayout) as DrawerLayout? ?: throw RuntimeException("MvpDrawerActivity must have DrawerLayout in xml!")

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView?.setNavigationItemSelectedListener(this)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> {
                onBackButtonPressed()
                drawerLayout?.openDrawer(GravityCompat.START)
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }

    protected abstract fun onDrawerItemPressed(item: MenuItem?): Boolean

    protected abstract fun onBackButtonPressed()

}