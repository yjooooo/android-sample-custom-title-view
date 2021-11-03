package com.yjooooo.samplecustomtoolbar.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.yjooooo.samplecustomtoolbar.FirstActivity
import com.yjooooo.samplecustomtoolbar.R
import com.yjooooo.samplecustomtoolbar.SecondActivity
import com.yjooooo.samplecustomtoolbar.ThirdActivity
import com.yjooooo.samplecustomtoolbar.databinding.ActivityMainBinding
import com.yjooooo.samplecustomtoolbar.util.CustomTitleViewMode
import com.yjooooo.samplecustomtoolbar.util.EventObserver

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = mainViewModel
        setBackButtonClickObserve()
        setCloseButtonClickObserve()
        setPlusButtonClickObserve()
    }

    private fun setBackButtonClickObserve() {
        mainViewModel.backButtonClick.observe(this@MainActivity, EventObserver {
            if(it){
                startActivity(Intent(this@MainActivity, FirstActivity::class.java))
            }
        })
    }

    private fun setCloseButtonClickObserve() {
        mainViewModel.closeButtonClick.observe(this@MainActivity, EventObserver {
            if(it){
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }
        })
    }

    private fun setPlusButtonClickObserve() {
        mainViewModel.plusButtonClick.observe(this@MainActivity, EventObserver {
            if(it){
                startActivity(Intent(this@MainActivity, ThirdActivity::class.java))
            }
        })
    }
}
