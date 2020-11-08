package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val btnAcessar = findViewById<Button>(R.id.btnLogin)

        btnRegistrar.setOnClickListener{
            abrirTelaCadastroUsuario()
        }

        btnAcessar.setOnClickListener({
            abrirTelaHome()
        })
    }

    fun abrirTelaCadastroUsuario(){
        val intent = Intent(this, CadastroUsuarioActivity::class.java)
        startActivity(intent)
    }

    fun abrirTelaHome(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}