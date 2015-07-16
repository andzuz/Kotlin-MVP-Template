package com.example.andrzejz.kotlinproject

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.andrzejz.kotlinproject.singletons.Constants
import kotlinx.android.synthetic.activity_second.*;
import org.jetbrains.anko.intent
import org.jetbrains.anko.text


public class SecondActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        unwrapExtras()
    }

    private fun unwrapExtras() {
        val textFromBundle = intent.getStringExtra(Constants.ARG_EXTRA)
        helloTextView.setText(textFromBundle.toString())
    }

}
