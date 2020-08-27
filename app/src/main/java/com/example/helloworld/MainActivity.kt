package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Red.isEnabled = false;
        Yellow.isEnabled = false;
        Green.isEnabled = false;
    }

    fun buttonRedClick(view: View) {
        Red.isEnabled = true;
        Yellow.isEnabled = false;
        Green.isEnabled = false;

    }
    fun buttonYellowClick(view: View) {
        Red.isEnabled = false;
        Yellow.isEnabled = true;
        Green.isEnabled = false;

    }
    fun buttonGreenClick(view: View) {
        Red.isEnabled = false;
        Yellow.isEnabled = false;
        Green.isEnabled = true;

    }
}