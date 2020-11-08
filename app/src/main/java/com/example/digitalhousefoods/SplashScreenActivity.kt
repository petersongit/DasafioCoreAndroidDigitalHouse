package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

       //Toast.makeText(this, "Splash", Toast.LENGTH_LONG).show()

        Handler(Looper.getMainLooper()).postDelayed({
            finish()
            abrirTelaHome()
        },3000)
    }

    fun abrirTelaHome(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
