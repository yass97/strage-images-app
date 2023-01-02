package com.yass.strageimagesapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.strageimagesapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.content_layout, StrageImagesFragment())
            .commit()
    }
}