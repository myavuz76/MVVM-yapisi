package com.example.mykassa

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var sonuc = "0"

    fun toplamaYap(alinanSayi1 : String,alinanSayi2: String){

        val sayi1= alinanSayi1.toInt()
        val sayi2= alinanSayi2.toInt()

        val toplama = sayi1 + sayi2

        sonuc = toplama.toString()



    }

    fun carpmaYap(alinanSayi1 : String,alinanSayi2: String){

        val sayi1= alinanSayi1.toInt()
        val sayi2= alinanSayi2.toInt()

        val toplama = sayi1 * sayi2

        sonuc = toplama.toString()



    }
}
