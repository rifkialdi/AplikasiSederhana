package com.example.aplikasisederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setonclicklistener persegi
        val Sisi = idedtSisi.text

        idbtnKeliling.setOnClickListener {
            if (Sisi.isEmpty()){
                idedtSisi.error = "Isi sisi dulu"
                idedtSisi.requestFocus()
            } else if(Sisi.isNotEmpty()){
                KelilingPersegi(Sisi.toString().toInt())
            }
        }

        idbtnLuas.setOnClickListener {
            if (Sisi.isEmpty()){
                idedtSisi.error = "Isi sisi dulu"
                idedtSisi.requestFocus()
            }else if(Sisi.isNotEmpty()) {
                LuasPersegi(Sisi.toString().toInt())
            }
        }
        //end setonclicklistener persegi

        //setonclicklistener persegi panjang
        val panjangPersegiPanjang = idedtPanjang.text
        val lebarPersegiPanjang = idedtLebar.text

        idbtnKelilingPersegiPanjang.setOnClickListener {
            if(lebarPersegiPanjang.isEmpty() && panjangPersegiPanjang.isEmpty()){
                idedtLebar.error = "Isi lebar dulu"
                idedtPanjang.error = "Isi panjang dulu"
                idedtLebar.requestFocus()
            }else if(lebarPersegiPanjang.isEmpty()){
                idedtLebar.error = "Isi lebar dulu"
                idedtLebar.requestFocus()
            }else if (panjangPersegiPanjang.isEmpty()){
                idedtPanjang.error = "Isi panjang dulu"
                idedtPanjang.requestFocus()
            }else if(lebarPersegiPanjang.isNotEmpty() && panjangPersegiPanjang.isNotEmpty()){
                KelilingPersegiPanjang(panjangPersegiPanjang.toString().toInt(), lebarPersegiPanjang.toString().toInt())
            }
        }

        idbtnLuasPersegiPanjang.setOnClickListener {
            if(lebarPersegiPanjang.isEmpty() && panjangPersegiPanjang.isEmpty()){
                idedtLebar.error = "Isi lebar dulu"
                idedtPanjang.error = "Isi panjang dulu"
                idedtLebar.requestFocus()
            }else if(lebarPersegiPanjang.isEmpty()){
                idedtLebar.error = "Isi lebar dulu"
                idedtLebar.requestFocus()
            }else if (panjangPersegiPanjang.isEmpty()){
                idedtPanjang.error = "Isi panjang dulu"
                idedtPanjang.requestFocus()
            }else if(panjangPersegiPanjang.isNotEmpty() && lebarPersegiPanjang.isNotEmpty()){
                LuasPersegiPanjang(panjangPersegiPanjang.toString().toInt(),lebarPersegiPanjang.toString().toInt())
            }
        }
        //end setonclicklistener persegi panjang

        //setonclicklistener jajar genjang
        val alasJajarGenjang = idedtalasjajar.text
        val tinggiJajarGenjang = idedttinggijajar.text

        idbtnLuasJajarGenjang.setOnClickListener {
            if (alasJajarGenjang.isEmpty()){
                idedtalasjajar.error = "Isi alas dulu"
                idedtalasjajar.requestFocus()
            }else if (tinggiJajarGenjang.isEmpty()){
                idedttinggijajar.error = "Isi tinggi dulu"
                idedttinggijajar.requestFocus()
            }else if(alasJajarGenjang.isNotEmpty() && tinggiJajarGenjang.isNotEmpty()){
                LuasJajarGenjang(alasJajarGenjang.toString().toInt(), tinggiJajarGenjang.toString().toInt())
            }
        }
        //end setonclicklistener jajar genjang

        //setonclicklistener Trapesium


        idbtnLuasTrapesium.setOnClickListener {
            val sisiAtasTrapesium = idedtSisiSejajarAtas.text
            val sisiBawahTrapesium = idedtSisiSejajarBawah.text
            val tinggiTrapesium = idedtTinggiTrapesium.text

            if (sisiAtasTrapesium.isEmpty()){
                idedtSisiSejajarAtas.error = "Isi sisi atas dulu"
                idedtSisiSejajarAtas.requestFocus()
            }else if (sisiBawahTrapesium.isEmpty()){
                idedtSisiSejajarBawah.error = "Isi sisi bawah dulu"
                idedtSisiSejajarBawah.requestFocus()
            }else if (tinggiTrapesium.isEmpty()){
                idedtTinggiTrapesium.error = "Isi tinggi dulu"
                idedtTinggiTrapesium.requestFocus()
            }else{
                LuasTrapesium(sisiAtasTrapesium.toString().toInt(), sisiBawahTrapesium.toString().toInt(), tinggiTrapesium.toString().toInt())
            }
        }
        //end setonclicklistener Trapesium
    }

    //function persegi
    fun KelilingPersegi(sisi : Int){
        val result = sisi * 4
        idtvresultpersegi.text = "Hasil Keliling : $result"
    }

    fun LuasPersegi(sisi: Int){
        val result = sisi * sisi
        idtvresultpersegi.text = "Hasil Luas : $result"
    }
    //end function persegi

    //function persegi panjang
    fun LuasPersegiPanjang(panjang: Int, lebar: Int){
        val result = panjang * lebar
        idtvresultpersegiPanjang.text = "Hasil Keliling $result"
    }

    fun KelilingPersegiPanjang(panjang: Int, lebar: Int){
        val result = 2 * (panjang * lebar)
        idtvresultpersegiPanjang.text = "Hasil Keliling $result"
    }
    //end function persegi panjang

    //function jajar genjang
    fun LuasJajarGenjang(alas: Int, tinggi: Int){
        val result = alas * tinggi
        idtvresultJajarGenjang.text = result.toString()
    }
    //end function jajar genjang

    //function Trapesium
    fun LuasTrapesium(sisiAtas: Int, sisiBawah: Int, tinggi: Int){
        val result = 0.5 * (sisiAtas * sisiBawah) * tinggi
        idtvresultTrapesium.text = result.toString()
    }
    //end function Trapesium

}