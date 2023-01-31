package com.example.myappmvvmhilt.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myappmvvmhilt.domain.WebImageRepository
import com.example.myappmvvmhilt.domain.WebImageUIData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WebImageViewModel @Inject constructor(private val repository: WebImageRepository) : ViewModel() {

    private val _liveData = MutableLiveData<WebImageUIData>()
    val liveData: LiveData<WebImageUIData> get() = _liveData

    fun getImage() {
        val url = repository.getImage()
        _liveData.value = url
    }
}