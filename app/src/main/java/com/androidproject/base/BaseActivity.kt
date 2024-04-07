package com.androidproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.androidproject.remote.ApiService
import com.androidproject.remote.RetrofitInstance
import retrofit2.Retrofit

abstract class BaseActivity<VB : ViewBinding>(private val bindingInflater: (LayoutInflater) -> VB) :
    AppCompatActivity() {

    lateinit var binding: VB

    val remoteService: ApiService
        get() = RetrofitInstance.apiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingInflater.invoke(layoutInflater)
        setContentView(binding.root)
    }

    fun showToast(text: String?) {
        Toast.makeText(baseContext, text, Toast.LENGTH_SHORT).show()
    }

    fun showSnackBar() {

    }
}