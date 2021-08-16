package com.hermawan.aydbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hermawan.aydbot.databinding.ActivityNameBinding

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            val nickname = binding.edtName.text
            //ToDo Nickname Button
        }
    }
}