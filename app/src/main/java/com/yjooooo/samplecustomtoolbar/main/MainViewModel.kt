package com.yjooooo.samplecustomtoolbar.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yjooooo.samplecustomtoolbar.custom.CustomTitleView
import com.yjooooo.samplecustomtoolbar.util.Event

class MainViewModel : ViewModel() {
    private val _backButtonClick = MutableLiveData<Event<Boolean>>()
    val backButtonClick: LiveData<Event<Boolean>> = _backButtonClick

    private val _plusButtonClick = MutableLiveData<Event<Boolean>>()
    val plusButtonClick: LiveData<Event<Boolean>> = _plusButtonClick

    private val _closeButtonClick = MutableLiveData<Event<Boolean>>()
    val closeButtonClick: LiveData<Event<Boolean>> = _closeButtonClick

    val mainBackButtonClick = object:CustomTitleView.OnBackClickListener{
        override fun onBackClick() {
            setBackButtonClick()
        }
    }

    val mainCloseButtonClick = object:CustomTitleView.OnCloseClickListener{
        override fun onCloseClick() {
            setCloseButtonClick()
        }
    }

    val mainPlusButtonClick = object:CustomTitleView.OnPlusClickListener{
        override fun onPlusClick() {
            setPlusButtonClick()
        }
    }

    fun setBackButtonClick() {
        _backButtonClick.value = Event(true)
    }

    fun setCloseButtonClick() {
        _closeButtonClick.value = Event(true)
    }

    fun setPlusButtonClick() {
        _plusButtonClick.value = Event(true)
    }
}
