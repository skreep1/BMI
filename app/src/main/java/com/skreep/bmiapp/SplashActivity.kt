package com.skreep.bmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.skreep.bmiapp.databinding.ActivityHomeBinding
import com.skreep.bmiapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        setBackgroundSecond()
    }


    private fun setBackgroundSecond() {

        Handler(Looper.myLooper() ?: return).postDelayed({

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }, 2000)
    }
}