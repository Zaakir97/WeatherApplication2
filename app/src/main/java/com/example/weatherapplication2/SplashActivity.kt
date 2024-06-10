package com.example.weatherapplication2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //Set the content view to the splash screen layout
        setContentView(R.layout.activity_splash) //Handler to delay the transition from SplashActivity to MainActivity

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent) //Create an intent to start MainActivity
            finish() //Finish SplashActivity so it can't be returned to
        }, 10000) // 10 seconds delay
    }
}
