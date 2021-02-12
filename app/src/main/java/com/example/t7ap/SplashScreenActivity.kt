package com.example.t7ap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_SCREEN_TIME: Long = 5200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()


        Handler().postDelayed({
            val newintent = Intent(this, LoginActivity::class.java)
            startActivity(newintent)
            finish()
        }, SPLASH_SCREEN_TIME)

    }
}