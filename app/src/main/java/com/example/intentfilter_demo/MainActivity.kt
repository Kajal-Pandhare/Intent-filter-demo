package com.example.intentfilter_demo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import com.example.intentfilter_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        StrictMode.setVmPolicy(
            VmPolicy.Builder().build()
        )

        initViews()
        initListener()
    }
    private fun initListener(){
        binding.btnViewImage.setOnClickListener {
            val intent = Intent("in.bitcode.action.media.VIEW")
            intent.setDataAndType(
                Uri.parse(binding.edtFilePath.text.toString()),
                "image/jpeg"
            )
            startActivity(intent)
        }
    }
    private fun initViews(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}