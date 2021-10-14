package com.gloorystudio.fookcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gloorystudio.fook.calc.Fook
import com.gloorystudio.fook.calc.Fook.Companion.calculate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(Fook.calc("44+4"))
        println("55-2".calculate())
    }
}