package com.hermawan.aydbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hermawan.aydbot.databinding.ActivityChatAjaBinding

class ChatAjaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityChatAjaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.wvChat.settings.javaScriptEnabled = true
        binding.wvChat.loadUrl("https://widget.chataja.co.id/?key=d49eca7130d4132aba9f333ee1a4b3031055a13e")
    }
}