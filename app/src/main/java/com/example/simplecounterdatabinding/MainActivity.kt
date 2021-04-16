package com.example.simplecounterdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.simplecounterdatabinding.databinding.ActivityMainBinding
import com.example.simplecounterdatabinding.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        dataBinding.apply {
            this.lifecycleOwner = this@MainActivity
            this.viewmodel = mainViewModel
        }

//        mainViewModel.currentCount.observe(this, Observer {
//
//        })
    }
}