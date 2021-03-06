package com.yjooooo.samplecustomtoolbar.util

import androidx.databinding.BindingAdapter
import com.yjooooo.samplecustomtoolbar.custom.CustomTitleView

object BindingAdapters {
    @BindingAdapter("setTitleViewMode")
    @JvmStatic
    fun setTitleViewMode(view: CustomTitleView, mode: Int) {
        view.setMode(mode)
    }

    @BindingAdapter("onBackClick")
    @JvmStatic
    fun onBackClick(view: CustomTitleView, clickEvent: () -> Unit) {
        view.setBackButtonClickListener(clickEvent)
    }

    @BindingAdapter("onCloseClick")
    @JvmStatic
    fun onCloseClick(view: CustomTitleView, clickEvent: () -> Unit) {
        view.setCloseButtonClickListener(clickEvent)
    }

    @BindingAdapter("onPlusClick")
    @JvmStatic
    fun onPlusClick(view: CustomTitleView, clickEvent: () -> Unit) {
        view.setPlusButtonClickListener(clickEvent)
    }
}
