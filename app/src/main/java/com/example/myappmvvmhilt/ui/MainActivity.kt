package com.example.myappmvvmhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.myappmvvmhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val vm by viewModels<WebImageViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.liveData.observe(this) {
            val imageView = findViewById<ImageView>(R.id.iv_web_picture)
            Glide
                .with(this)
                .load(it.url)
                .into(imageView)
        }

        vm.getImage()
    }
}