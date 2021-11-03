package com.yjooooo.samplecustomtoolbar.util

import androidx.databinding.BindingAdapter
import com.yjooooo.samplecustomtoolbar.custom.CustomTitleView
import com.yjooooo.samplecustomtoolbar.main.MainViewModel

object BindingAdapters {
    @BindingAdapter("setViewModel")
    @JvmStatic
    fun setViewModel(view: CustomTitleView, viewModel: MainViewModel) {
        view.setButtonClickListener(viewModel)
    }

    @BindingAdapter("onBackClick")
    @JvmStatic
    fun onBackClick(view: CustomTitleView, listener: CustomTitleView.OnBackClickListener) {
        view.setBackButtonClickListener(listener)
    }

    @BindingAdapter("onCloseClick")
    @JvmStatic
    fun onCloseClick(view: CustomTitleView, listener: CustomTitleView.OnCloseClickListener) {
        view.setCloseButtonClickListener(listener)
    }

    @BindingAdapter("onPlusClick")
    @JvmStatic
    fun onPlusClick(view: CustomTitleView, listener: CustomTitleView.OnPlusClickListener) {
        view.setPlusButtonClickListener(listener)
    }
}
