package com.example.hqawasomeapp

import androidx.lifecycle.ViewModel

class HQViewModel : ViewModel() {

    fun loadHQDetails(): HQDetails {
        return HQDetails("Minha HQ", "Este é apenas um texto de conteudo teste")
    }

}