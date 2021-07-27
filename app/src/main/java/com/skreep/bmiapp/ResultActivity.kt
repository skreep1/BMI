package com.skreep.bmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skreep.bmiapp.databinding.ActivityResultBinding
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        binding.icBack.setOnClickListener {
            startActivity(Intent(this@ResultActivity, HomeActivity::class.java))

        }

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        val bmiResult = weight * weight / height



        when (bmiResult) {
            in 0..19-> {
                binding.tvBmiText.setText(R.string.underweight)
                binding.tvBmiResult.setText(bmiResult.toString())
            }
            in 19..25 -> {
                binding.tvBmiText.setText(R.string.normal)
                binding.tvBmiResult.setText(bmiResult.toString())
            }
            in 25..30 -> {
                binding.tvBmiText.setText(R.string.overweight)
                binding.tvBmiResult.setText(bmiResult.toString())
            }
            in 35..50 -> {
                binding.tvBmiText.setText(R.string.obese)
                binding.tvBmiResult.setText(bmiResult.toString())
            }
    }



        }

    }




