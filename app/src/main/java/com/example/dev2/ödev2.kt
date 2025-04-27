package com.example.dev2

class ödev2 {
    fun soru1(C: Double): Double{
        return C*1.8 + 32
    }

    fun soru2(uzunKenarlar: Int,kısaKenarlar: Int): Int{
        return 2*uzunKenarlar+2*kısaKenarlar
    }
    fun soru3(kelime: String): Int {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                sayac++
            }
        }
        return sayac
    }
}