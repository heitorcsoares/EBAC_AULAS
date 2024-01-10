package com.example.hqawasomeapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HQViewModel : ViewModel() {

    /** LiveData - Criação de Variavel - Title */
    private val _hqTitleLiveData = MutableLiveData<HQFragment>()
    val hqTitleLiveData: LiveData<HQFragment>
        get() = _hqTitleLiveData

    /** LiveData - Criação de Variavel - Details */
    private val _hqDetailsLiveData = MutableLiveData<HQDetails>()
    val hqDetailsLiveData: LiveData<HQDetails>
        get() = _hqDetailsLiveData


    /**Função para carregar conteudo. Tipo [HQDetails.kt]*/
    fun loadHQDetails(): HQDetails {
        return HQDetails("Minha HQ", "Este apenas contéudo fixo")
    }


}