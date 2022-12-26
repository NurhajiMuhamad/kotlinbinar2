package com.example.binarkuemen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("bagi")



        println("Hello World!")
        println("=============================")
        println("GAME SUIT TERMINAL VERSION")
        println("=============================")
        println("1. Masukkan pemain 1: ")
        val pemain1: String = readln()
        println("=============================")
        println("2. Masukkan pemain 2: ")
        val pemain2: String = readln()
        println("=============================")
        println("Hasil:")
        if (pemain1 == "gunting" && pemain2 == "gunting") {
            println("DRAW!")
        } else if (pemain1 == "batu" && pemain2 == "batu") {
            println("DRAW!")
        } else if (pemain1 == "kertas" && pemain2 == "kertas") {
            println("DRAW!")
        } else if (pemain1 == "gunting" && pemain2 == "kertas") {
            println("Pemain 1 MENANG!")
        } else if (pemain1 == "gunting" && pemain2 == "batu") {
            println("Pemain 2 MENANG!")
        } else if (pemain1 == "batu" && pemain2 == "kertas") {
            println("Pemain 2 MENANG!")
        } else if (pemain1 == "batu" && pemain2 == "gunting") {
            println("Pemain 1 MENANG!") //salah
        } else if (pemain1 == "kertas" && pemain2 == "gunting") {
            println("Pemain 2 MENANG!")
        } else if (pemain1 == "kertas" && pemain2 == "batu") {
            println("Pemain 1 MENANG!")
        } else {
            println("error")
        }
    }
}