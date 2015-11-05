package com.example.andrzejz.kotlinproject.views.abstract_views

import java.util.*

/**
 * Created by andrzejzuzak on 22/10/15.
 */
interface TableViewContract<IT>: ViewContract {

    fun addItems(items: ArrayList<IT>)
    fun clear()

}