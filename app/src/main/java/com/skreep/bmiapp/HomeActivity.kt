package com.skreep.bmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.skreep.bmiapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        binding.btn.setOnClickListener {

            if (binding.etHeight.text.isEmpty() || binding.etWeight.text.isEmpty()) {

                Toast.makeText(applicationContext, "Вы не указали данные", Toast.LENGTH_SHORT).show()

            }

            val height: Int = binding.etHeight.text.toString().toInt()
            val weight: Int = binding.etWeight.text.toString().toInt()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("height", height)
            intent.putExtra("weight", weight)

            startActivity(intent)


        }
    }

}