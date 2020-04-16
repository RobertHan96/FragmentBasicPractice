package com.nexon.fragmentbasicpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()
    abstract fun setValus()
}
