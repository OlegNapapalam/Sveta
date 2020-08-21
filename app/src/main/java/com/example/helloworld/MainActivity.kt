package com.example.helloworld

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout


class MainActivity : Activity() {

    var makeRed: LinearLayout? = null
    var makeGreen: LinearLayout? = null
    var makeYellow: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        makeRed = findViewById(R.id.Red)
        makeGreen = findViewById(R.id.Green)
        makeYellow = findViewById(R.id.Yellow)
    }

    fun buttonRedClick(view: View) {
        makeRed?.setBackgroundResource(R.drawable.ic_sem_red)
        makeGreen?.setBackgroundResource(R.drawable.ic_sem_black)
        makeYellow?.setBackgroundResource(R.drawable.ic_sem_black)
    }
    fun buttonYellowClick(view: View) {
        makeRed?.setBackgroundResource(R.drawable.ic_sem_black)
        makeGreen?.setBackgroundResource(R.drawable.ic_sem_yellow)
        makeYellow?.setBackgroundResource(R.drawable.ic_sem_black)
    }
    fun buttonGreenClick(view: View) {
        makeRed?.setBackgroundResource(R.drawable.ic_sem_black)
        makeGreen?.setBackgroundResource(R.drawable.ic_sem_black)
        makeYellow?.setBackgroundResource(R.drawable.ic_sem_green)
    }
}