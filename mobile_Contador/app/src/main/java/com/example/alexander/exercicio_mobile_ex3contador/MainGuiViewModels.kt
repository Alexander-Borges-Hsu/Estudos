package com.example.alexander.exercicio_mobile_ex3contador

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainGuiViewModels: ViewModel() {

    private val _contador = MutableLiveData(0);
    var contador = _contador;

    fun incrementaContador(){
        _contador.value = _contador.value?.plus(1);
    }

}