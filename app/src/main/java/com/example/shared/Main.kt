package com.example.shared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shared.UserApp.Companion.preferencias
import com.example.shared.databinding.ActivityMainBinding

class Main : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //funcion que controla el evento del boton guardar
        guardado()
        //funcion que valida el nombre, que nos obligue a ingresar algo.
        checkeoDatos()

    }

    private fun checkeoDatos() {
        if(preferencias.obtenerDatos().isNotEmpty()){
            irDetalles()
        }

    }

    private fun irDetalles() {
        var intento = Intent(this, Guardado::class.java)
        startActivity(intento)
    }

    private fun guardado() {
        binding.btnGuardar.setOnClickListener { save() }
    }

    private fun save() {
        var aux = binding.edtNombre.text.toString()
        if(aux.isNotEmpty()){
            //guardar dato
            preferencias.guardar(aux)
            irDetalles()
        }
    }

}