package com.example.fundamental_tutorial_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.fundamental_tutorial_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val etFirstName = binding.etFirstName
        val etLastName = binding.etLastName
        val etBirthDate = binding.etBirthDate
        val etCountry = binding.etCountry
        val btnApply = binding.btnApply

        btnApply.setOnClickListener{
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Log.d("MainActivity", "${firstName} ${lastName} ${birthDate} ${country}")
        }

    }
}