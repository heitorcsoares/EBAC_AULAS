package com.example.hqawasomeapp.placeholder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hqawasomeapp.HQDetails

class DataState {
    val hqDetailsLiveData: LiveData<HQDetails>
        get() = _hqDetailsLiveData
    private val _hqDetailsLiveData = MutableLiveData<HQDetails>()
}