package com.kakapo.kotlin.urbanjuara.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakapo.kotlin.urbanjuara.databinding.ActivityLoginBinding
import com.kakapo.kotlin.urbanjuara.presentation.ui.main.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var username: String
    private lateinit var password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        username = binding.inputTxtUsername.text.toString()
        password = binding.inputTxtPassword.text.toString()

        buttonLoginOnClick()
        buttonDaftarOnClick()
    }

    private fun goToMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun gotoDaftarActivity(){
        val intent = Intent(this, DaftarActivity::class.java)
        startActivity(intent)
    }

    private fun buttonLoginOnClick(){
        binding.btnLogin.setOnClickListener{
            goToMainActivity()
        }
    }

    private fun buttonDaftarOnClick(){
        binding.btnDaftar.setOnClickListener {
            gotoDaftarActivity()
        }
    }
}