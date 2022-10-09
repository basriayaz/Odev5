package com.example.odev5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        //var tiklama:String = tasarim.textViewSonuc.toString()
        var ilkDeger:String = tasarim.textViewSonuc.toString()
        var degisken: Int = 0
        var topla: Double = 0.0


        tasarim.button0.setOnClickListener {
            if(degisken==0){
            tasarim.textViewSonuc.append("0")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("0")
            }
        }
        tasarim.button1.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("1")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("1")
            }
        }
        tasarim.button2.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("2")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("2")
            }
        }
        tasarim.button3.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("3")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("3")
            }
        }
        tasarim.button4.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("4")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("4")
            }
        }
        tasarim.button5.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("5")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("5")
            }
        }
        tasarim.button6.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("6")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("6")
            }
        }
        tasarim.button7.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("7")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("7")
            }
        }
        tasarim.button8.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("8")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("8")
            }
        }
        tasarim.button9.setOnClickListener {
            if(degisken==0){
                tasarim.textViewSonuc.append("9")
            }else {
                tasarim.textViewSonuc.text = ""
                degisken=0
                tasarim.textViewSonuc.append("9")
            }
        }
        tasarim.buttonC.setOnClickListener {
            tasarim.textViewSonuc.text = ""
        }
        tasarim.buttonArti.setOnClickListener {
            ilkDeger = tasarim.textViewSonuc.text.toString()
            topla += ilkDeger.toDouble()
            tasarim.textViewSonuc.text = ""

        }
        tasarim.buttonEsittir.setOnClickListener {
            tasarim.textViewSonuc.text =  (topla.toDouble() + tasarim.textViewSonuc.text.toString().toDouble()).toString()
            degisken = 1
            topla = 0.0
            ilkDeger= "0"
        }



    }}