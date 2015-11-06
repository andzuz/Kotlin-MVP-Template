package com.example.andrzejz.kotlinproject.activities

import android.view.ViewGroup
import com.example.andrzejz.kotlinproject.mvp.MvpContainerActivity
import com.example.andrzejz.kotlinproject.views.implementations.SampleListImpl

/**
 * Created by andrzejzuzak on 06/11/15.
 */

class SampleContainerActivity : MvpContainerActivity() {

    override fun getInitialView(): ViewGroup {
        return SampleListImpl(this);
    }

}