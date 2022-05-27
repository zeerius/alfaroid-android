package com.example.alfaroid.ui.syariah

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SyariahViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Halaman Dasar Syariah"
    }
    val text: LiveData<String> = _text
}