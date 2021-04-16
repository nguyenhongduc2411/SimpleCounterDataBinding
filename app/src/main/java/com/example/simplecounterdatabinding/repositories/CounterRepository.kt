package com.example.simplecounterdatabinding.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

//Singleton
object CounterRepository {
    private var mIntCurrentCount: Int = 0
    private val mCurrentCount = MutableLiveData<String>()
    val currentCount: LiveData<String> get() = mCurrentCount //getter

    init {
        mCurrentCount.postValue(mIntCurrentCount.toString())
    }

    fun incrementCounter() {
        mIntCurrentCount++
        mCurrentCount.postValue(mIntCurrentCount.toString())
    }

    fun resetCounter() {
        mIntCurrentCount = 0
        mCurrentCount.postValue(mIntCurrentCount.toString())
    }
}