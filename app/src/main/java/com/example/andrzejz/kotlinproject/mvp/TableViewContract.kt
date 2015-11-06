package com.example.andrzejz.kotlinproject.mvp

import com.example.andrzejz.kotlinproject.mvp.ViewContract
import java.util.*

/**
 * Created by andrzejzuzak on 22/10/15.
 */
interface TableViewContract<IT>: ViewContract {

    fun addItems(items: ArrayList<IT>)
    fun clear()

}