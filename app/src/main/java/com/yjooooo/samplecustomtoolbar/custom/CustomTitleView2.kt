package com.yjooooo.samplecustomtoolbar.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.yjooooo.samplecustomtoolbar.R
import com.yjooooo.samplecustomtoolbar.databinding.CustomTitleView2Binding
import com.yjooooo.samplecustomtoolbar.util.CustomTitleViewMode
import java.lang.IllegalStateException

class CustomTitleView2 : ConstraintLayout {
    private lateinit var binding: CustomTitleView2Binding
    private var titleViewMode: Int = -1

    constructor(context: Context) : super(context) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs) {
        initView()
    }

    private fun initView() {
        val layoutInflater = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.custom_title_view_2,
            this@CustomTitleView2,
            true
        )
        binding.view = this
    }

    fun setTitleViewText(title: String) {
        binding.tvCustomTitleViewTitle.text = title
    }

    fun setTitleViewMode(mode: Int) {
        titleViewMode = mode
        when (titleViewMode) {
            CustomTitleViewMode.TITLE_VIEW_BACK_BUTTON -> binding.btnCustomTitleViewBack.visibility =
                View.VISIBLE
            CustomTitleViewMode.TITLE_VIEW_CLOSE_BUTTON -> binding.btnCustomTitleViewClose.visibility =
                View.VISIBLE
            CustomTitleViewMode.TITLE_VIEW_PLUS_BUTTON -> binding.btnCustomTitleViewPlus.visibility =
                View.VISIBLE
            else -> throw IllegalStateException()
        }
    }

    fun setOnBackBtnClick(clickEvent: () -> Unit) {
        binding.btnCustomTitleViewBack.setOnClickListener { clickEvent() }
    }

    fun setOnCloseBtnClick(clickEvent: () -> Unit) {
        binding.btnCustomTitleViewClose.setOnClickListener { clickEvent() }
    }

    fun setOnPlusBtnClick(clickEvent: () -> Unit) {
        binding.btnCustomTitleViewPlus.setOnClickListener { clickEvent() }
    }
}
