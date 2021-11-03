package com.yjooooo.samplecustomtoolbar

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.annotation.Nullable
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt



//class CustomToolbar : LinearLayout {
//    @AttrString
//    var titleName: String? = null
//
//    @AttrInt
//    var titleMode = 0
//    private var mBinding: TitleViewBinding? = null
//    private var mOnClickBackListener: OnClickBackListener? = null
//    private var mOnClickDeleteListener: OnClickDeleteListener? = null
//    private var mOnClickCloseListener: OnClickCloseListener? = null
//
//    @Inject
//    var mPreferenceRepository: PreferenceRepository? = null
//    var mTitle: ObservableString = ObservableString("")
//    var mMode: ObservableInt = ObservableInt(0)
//
//    constructor(context: Context?) : super(context) {
//        init(null)
//    }
//
//    constructor(context: Context?, @Nullable attrs: AttributeSet?) : super(context, attrs) {
//        init(attrs)
//    }
//
//    private fun init(attrs: AttributeSet?) {
//        val inflater = LayoutInflater.from(context)
//        mBinding = DataBindingUtil.inflate(inflater, R.layout.title_view, this, true)
//        mBinding.setView(this)
//        if (attrs != null) {
//            val array: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.TitleView)
//            TitleViewAttributes.apply(this, array)
//        }
//        if (titleName != null) mTitle.set(titleName)
//        mMode.set(titleMode)
//        mBinding.notifyChange()
//    }
//
//    fun setTitle(title: String?) {
//        mTitle.set(title)
//    }
//
//    fun setMode(mode: Int) {
//        mMode.set(mode)
//    }
//
//    override fun onFinishInflate() {
//        super.onFinishInflate()
//        if (isInEditMode) {
//            return
//        }
//        // MainApplication.getAppComponent().inject(this)
//        Log.i(
//            CustomToolbar::class.java.simpleName,
//            "onFinishInflate: mPreferenceRepository == null : " + (mPreferenceRepository == null)
//        )
//    }
//
//    fun clickBack(view: View?) {
//        if (mOnClickBackListener != null) {
//            mOnClickBackListener!!.onClick(view)
//        }
//    }
//
//    fun clickDelete(view: View?) {
//        if (mOnClickDeleteListener != null) {
//            mOnClickDeleteListener!!.onClickDelete(view)
//        }
//    }
//
//    fun clickClose(view: View?) {
//        if (mOnClickCloseListener != null) {
//            mOnClickCloseListener!!.onClickClose(view)
//        }
//    }
//
//    fun setOnClickBackListener(clickListener: OnClickBackListener?) {
//        mOnClickBackListener = clickListener
//    }
//
//    fun setOnClickDeleteListener(clickListener: OnClickDeleteListener?) {
//        mOnClickDeleteListener = clickListener
//    }
//
//    fun setOnClickCloseListener(clickListener: OnClickCloseListener?) {
//        mOnClickCloseListener = clickListener
//    }
//
//    interface OnClickBackListener {
//        fun onClick(view: View?)
//    }
//
//    interface OnClickDeleteListener {
//        fun onClickDelete(view: View?)
//    }
//
//    interface OnClickCloseListener {
//        fun onClickClose(view: View?)
//    }
//
//    companion object {
//        @BindingAdapter("bindTitle")
//        fun bindTitleName(view: CustomToolbar, title: String?) {
//            view.setTitle(title)
//        }
//
//        @BindingAdapter("bindMode")
//        fun bindTitleMode(view: CustomToolbar, mode: Int) {
//            view.setMode(mode)
//        }
//
//        @BindingAdapter("onClickBack")
//        fun bindClickBack(view: CustomToolbar, listener: OnClickBackListener?) {
//            view.setOnClickBackListener(listener)
//        }
//
//        @BindingAdapter("onClickDelete")
//        fun bindClickDelete(view: CustomToolbar, listener: OnClickDeleteListener?) {
//            view.setOnClickDeleteListener(listener)
//        }
//
//        @BindingAdapter("onClickCLose")
//        fun bindClickClose(view: CustomToolbar, listener: OnClickCloseListener?) {
//            view.setOnClickCloseListener(listener)
//        }
//    }
//}
