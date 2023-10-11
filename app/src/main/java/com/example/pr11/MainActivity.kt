package com.example.pr11

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        fun loadImageCat() {
            imageView.setImageResource(R.drawable.cat3)
        }

        myButton.setOnClickListener {
            loadImageCat()
        }

        fun loadImageChkd() {
            imageButton.setImageResource(R.drawable.btn_check_buttonless_on)
        }
        imageButton.setOnClickListener {
            loadImageChkd()
        }
      }
    }
