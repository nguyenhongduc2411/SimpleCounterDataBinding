package com.example.simplecounterdatabinding.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simplecounterdatabinding.repositories.CounterRepository

class MainViewModel : ViewModel() {
    val currentCount: LiveData<String> get() = CounterRepository.currentCount //getter

    fun onResetBtnClick() = CounterRepository.resetCounter()

    fun onIncrementBtnClick() = CounterRepository.incrementCounter()
}