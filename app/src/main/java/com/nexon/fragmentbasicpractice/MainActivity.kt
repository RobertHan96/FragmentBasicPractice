package com.nexon.fragmentbasicpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValus()
    }

    override fun setupEvents() {
    }

    override fun setValus() {
    }

}
