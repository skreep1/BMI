package com.skreep.bmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skreep.bmiapp.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)

        setContentView(binding.root)
        bmiCalculate()

        binding.recalculateButton.setOnClickListener {
            startActivity(Intent(this@ResultActivity, HomeActivity::class.java))

        }


    }

    private fun bmiCalculate() {

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        when (val result = weight * weight / height) {
            in 0..19 -> {
                binding.tvBmiText.setText(R.string.underweight)
                binding.tvBmiResult.setText(result.toString())
            }
            in 19..25 -> {
                binding.tvBmiText.setText(R.string.normal)
                binding.tvBmiResult.setText(result.toString())
            }
            in 25..30 -> {
                binding.tvBmiText.setText(R.string.overweight)
                binding.tvBmiResult.setText(result.toString())
            }
            in 35..50 -> {
                binding.tvBmiText.setText(R.string.obese)
                binding.tvBmiResult.setText(result.toString())
            }
        }
    }

}




