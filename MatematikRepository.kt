package com.example.mykassa

import androidx.lifecycle.MutableLiveData


class MatematikRepository {

    var matematikselSonuc = MutableLiveData<String>()

    init {
        //varsayilan deger tamak icin init yapisi kullaniyoruz
        matematikselSonuc = MutableLiveData<String>("0")
    }
    //burda matematikselSonuc degiskenini ViewModel sinifimiza aktarmak icin
    //bir Fonksiyon olusturuyoruz
    fun matematikselSonucGetir() : MutableLiveData<String>{
        return matematikselSonuc

    }


    fun topla(alinanSayi1 : String,alinanSayi2: String){

        val sayi1= alinanSayi1.toInt()
        val sayi2= alinanSayi2.toInt()

        val toplama = sayi1 + sayi2

        matematikselSonuc.value = toplama.toString()
    }

    fun carp(alinanSayi1 : String,alinanSayi2: String){

        val sayi1= alinanSayi1.toInt()
        val sayi2= alinanSayi2.toInt()

        val toplama = sayi1 * sayi2

        matematikselSonuc.value = toplama.toString()
    }
}
