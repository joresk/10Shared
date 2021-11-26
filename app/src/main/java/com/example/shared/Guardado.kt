package com.example.shared

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shared.UserApp.Companion.preferencias
import com.example.shared.databinding.ActivityGuardadoBinding
import com.example.shared.databinding.ActivityMainBinding

class Guardado : AppCompatActivity() {
    private lateinit var binding:ActivityGuardadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuardadoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inicio()
    }

    private fun inicio() {
        binding.btnBorrar.setOnClickListener {
            preferencias.borrar()
            onBackPressed()
        }
        binding.txtMensaje.text = "Hola Bienvenido: ${preferencias.obtenerDatos()}"
    }
}