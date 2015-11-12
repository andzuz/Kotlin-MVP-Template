package com.example.andrzejz.kotlinproject.presenters

import com.example.andrzejz.kotlinproject.mvp.MvpPresenter
import com.example.andrzejz.kotlinproject.mvp.TableViewContract
import com.example.andrzejz.kotlinproject.views.implementations.SampleListImpl

/**
 * Created by andrzejzuzak on 22/10/15.
 */

class SampleListPresenter<T>(receiver: TableViewContract<T>) : MvpPresenter<TableViewContract<T>>(receiver) {}