package com.kakapo.kotlin.urbanjuara.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakapo.kotlin.urbanjuara.R
import com.kakapo.kotlin.urbanjuara.databinding.ActivityDaftarBinding

class DaftarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaftarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaftarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}