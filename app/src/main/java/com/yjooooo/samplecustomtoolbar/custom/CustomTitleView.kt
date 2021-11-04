package com.yjooooo.samplecustomtoolbar.custom

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.yjooooo.samplecustomtoolbar.util.CustomTitleViewMode.Companion.TITLE_VIEW_BACK_BUTTON
import com.yjooooo.samplecustomtoolbar.util.CustomTitleViewMode.Companion.TITLE_VIEW_CLOSE_BUTTON
import com.yjooooo.samplecustomtoolbar.util.CustomTitleViewMode.Companion.TITLE_VIEW_PLUS_BUTTON
import com.yjooooo.samplecustomtoolbar.R
import com.yjooooo.samplecustomtoolbar.databinding.CustomTitleViewBinding
import java.lang.IllegalStateException

class CustomTitleView : ConstraintLayout {
    private lateinit var binding: CustomTitleViewBinding
    private var titleViewMode: Int = -1
    private var backClickListener: OnBackClickListener? = null
    private var closeClickListener: OnCloseClickListener? = null
    private var plusClickListener: OnPlusClickListener? = null

    constructor(context: Context) : super(context) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView()
        getAttrs(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs) {
        initView()
        getAttrs(attrs, defStyle)
    }

    private fun initView() {
        val layoutInflater = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.custom_title_view,
            this@CustomTitleView,
            true
        )
        binding.view = this
    }

    private fun getAttrs(attrs: AttributeSet) {
        // obtainStyledAttributes 함수는 Context의 Theme에서 Style로 지정한 속성 정보 리스트를 가져오는 역할을 합니다.
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleView)
        setTypedArray(typedArray)
    }

    private fun getAttrs(attrs: AttributeSet, defStyle: Int) {
        // obtainStyledAttributes 함수는 Context의 Theme에서 Style로 지정한 속성 정보 리스트를 가져오는 역할을 합니다.
        val typedArray =
            context.obtainStyledAttributes(attrs, R.styleable.CustomTitleView, defStyle, 0)
        setTypedArray(typedArray)
    }

    private fun setTypedArray(typedArray: TypedArray) {
        val titleText = typedArray.getString(R.styleable.CustomTitleView_titleText) ?: ""
        setTitleText(titleText)

        val mode =
            typedArray.getInt(R.styleable.CustomTitleView_titleViewMode, TITLE_VIEW_BACK_BUTTON)
        setTitleViewMode(mode)
    }

    private fun setTitleText(title: String) {
        binding.tvCustomTitleViewTitle.text = title
    }

    private fun setTitleViewMode(mode: Int) {
        titleViewMode = mode
        when (titleViewMode) {
            TITLE_VIEW_BACK_BUTTON -> binding.btnCustomTitleViewBack.visibility = View.VISIBLE
            TITLE_VIEW_CLOSE_BUTTON -> binding.btnCustomTitleViewClose.visibility = View.VISIBLE
            TITLE_VIEW_PLUS_BUTTON -> binding.btnCustomTitleViewPlus.visibility = View.VISIBLE
            else -> throw IllegalStateException()
        }
    }

    fun setBackButtonClickListener(listener: OnBackClickListener) {
        backClickListener = listener
    }

    fun setCloseButtonClickListener(listener: OnCloseClickListener) {
        closeClickListener = listener
    }

    fun setPlusButtonClickListener(listener: OnPlusClickListener) {
        plusClickListener = listener
    }

    fun backClick() {
        backClickListener?.onBackClick()
    }

    fun closeClick() {
        closeClickListener?.onCloseClick()
    }

    fun plusClick() {
        plusClickListener?.onPlusClick()
    }

    interface OnBackClickListener {
        fun onBackClick()
    }

    interface OnCloseClickListener {
        fun onCloseClick()
    }

    interface OnPlusClickListener {
        fun onPlusClick()
    }
}
