package com.example.intentfilter_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentfilter_demo.databinding.ImageActivityBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var binding: ImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }
    private fun initViews(){
         binding = ImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image.setImageURI(intent.data)
    }
}