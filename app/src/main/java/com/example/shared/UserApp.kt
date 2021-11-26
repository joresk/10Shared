package com.example.shared

import android.app.Application

class UserApp: Application() {
    companion object{
        lateinit var preferencias: Preferencias
    }

    override fun onCreate() {
        super.onCreate()
        preferencias = Preferencias(applicationContext)
    }
}