package com.example.mykassa

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var sonuc = MutableLiveData<String>()
    var mRepo = MatematikRepository()

    init {
        //varsayilan deger tamak icin init yapisi kullaniyoruz
        sonuc = mRepo.matematikselSonuc
    }

    fun toplamaYap(alinanSayi1 : String,alinanSayi2: String){

        mRepo.topla(alinanSayi1, alinanSayi2)
    }

    fun carpmaYap(alinanSayi1 : String,alinanSayi2: String){

       mRepo.carp(alinanSayi1,alinanSayi2)
    }
}
