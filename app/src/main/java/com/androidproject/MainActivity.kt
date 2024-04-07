package com.androidproject

import android.os.Bundle
import com.androidproject.base.BaseActivity
import com.androidproject.databinding.ActivityMainBinding
import com.androidproject.utils.Utility

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    fun init() {
        binding.tv.text = "I am the Nightmare"
        binding.button.setOnClickListener {
            Utility.hideKeyboard(this)
        }
        showToast("hello MF")
    }
}