package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class SplashScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Toast.makeText(this, "Splash", Toast.LENGTH_LONG).show()



        //Handler().postDelayed({
                abrirTelaHome()
                finish()
          //  },3000)

      /*  val backgroud = object : Thread() {
            override fun run() {
                Thread.sleep(3000)

                val intent = Intent(baseContext, MainActivity::class.java)
            }
        }

        backgroud.start()*/
    }

    fun abrirTelaHome(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}