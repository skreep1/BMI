package com.skreep.bmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setBackgroundSecond()
    }


    private fun setBackgroundSecond() {

        Handler(Looper.myLooper() ?: return).postDelayed({

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }, 2000)
    }
}