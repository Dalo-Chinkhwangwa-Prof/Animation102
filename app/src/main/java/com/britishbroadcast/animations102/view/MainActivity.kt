package com.britishbroadcast.animations102.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.britishbroadcast.animations102.R
import com.britishbroadcast.animations102.view.AnimationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val view = AnimationView(this)
        setContentView(R.layout.activity_main)

        main_loader.loadingText = "hahaha"
        Handler(mainLooper).postDelayed({main_loader.visibility = View.GONE}, 2000)
    }
}