package com.yjooooo.samplecustomtoolbar.util

import androidx.databinding.BindingAdapter
import com.yjooooo.samplecustomtoolbar.custom.CustomTitleView
import com.yjooooo.samplecustomtoolbar.main.MainViewModel

object BindingAdapters {
    @BindingAdapter("setViewModel")
    @JvmStatic
    fun setViewModel(view: CustomTitleView, viewModel:MainViewModel) {
        view.setButtonClickListener(viewModel)
    }

//    @BindingAdapter("onBackClick")
//    @JvmStatic
//    fun onBackClick(view: CustomTitleView, clickEvent: () -> Unit) {
//        view.setBackButtonClickListener(clickEvent)
//    }
//
//    @BindingAdapter("onCloseClick")
//    @JvmStatic
//    fun onCloseClick(view: CustomTitleView, clickEvent: () -> Unit) {
//        view.setCloseButtonClickListener(clickEvent)
//    }
//
//    @BindingAdapter("onPlusClick")
//    @JvmStatic
//    fun onPlusClick(view: CustomTitleView, clickEvent: () -> Unit) {
//        view.setPlusButtonClickListener(clickEvent)
//    }
}
