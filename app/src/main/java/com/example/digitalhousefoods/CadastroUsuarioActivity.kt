package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class CadastroUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

       // ActionBar actionBar = getActionBar();



        val btnRegitsrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegitsrar.setOnClickListener({
            abrirTelaHome()
        })
    }

    fun abrirTelaHome(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}