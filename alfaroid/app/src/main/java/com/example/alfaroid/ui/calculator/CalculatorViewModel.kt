package com.example.alfaroid.ui.calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Halaman Kalkulator Warisan"
    }
    val text: LiveData<String> = _text
}