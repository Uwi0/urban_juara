package com.kakapo.kotlin.urbanjuara.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakapo.kotlin.urbanjuara.databinding.ActivityLoginBinding
import com.kakapo.kotlin.urbanjuara.presentation.ui.main.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonLoginClick()
    }

    private fun goToMain(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun buttonLoginClick(){
        binding.btnLogin.setOnClickListener{
            goToMain()
        }
    }
}