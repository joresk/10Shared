package com.example.shared

import android.content.Context

class Preferencias (context: Context) {
    val NOMBRE = "Datos"
    val USER_NOMBRE = "Nombre"
    val almacen = context.getSharedPreferences(NOMBRE,0)

    fun guardar(nombre: String){
        almacen.edit().putString(USER_NOMBRE,nombre).apply()
    }
    fun obtenerDatos():String{
        return almacen.getString(USER_NOMBRE,"")!!
    }
    fun borrar(){
        almacen.edit().clear().apply()
    }
}