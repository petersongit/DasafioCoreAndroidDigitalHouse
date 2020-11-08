package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnTelaRegistro = findViewById<Button>(R.id.btnRegistrar)

        btnTelaRegistro.setOnClickListener{
            abrirTelaCadastroUsuario()
        }
    }

    fun abrirTelaCadastroUsuario(){
        val intent = Intent(this, CadastroUsuario::class.java)
        startActivity(intent)
    }
}