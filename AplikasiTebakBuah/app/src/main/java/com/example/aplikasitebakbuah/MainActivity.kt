package com.example.aplikasitebakbuah

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var imageView_apel: ImageView
    private lateinit var imageView_durian: ImageView
    private lateinit var imageView_ceri: ImageView
    private lateinit var imageView_alpukat: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setInisialisasi()
        onClickMantab()
    }

    private fun onClickMantab() {
        imageView_durian.setOnClickListener {
            val d = Intent(this@MainActivity, TebakActivity::class.java)
            d.putExtra("nama_buah", "durian")
            startActivity(d)
        }
        imageView_ceri.setOnClickListener {
            val c = Intent(this@MainActivity, TebakActivity::class.java)
            c.putExtra("nama_buah", "ceri")
            startActivity(c)
        }
        imageView_apel.setOnClickListener {
            val a = Intent(this@MainActivity, TebakActivity::class.java)
            a.putExtra("nama_buah", "apel")
            startActivity(a)
        }
        imageView_alpukat.setOnClickListener {
            val al = Intent(this@MainActivity, TebakActivity::class.java)
            al.putExtra("nama_buah", "alpukat")
            startActivity(al)
        }
    }

    private fun setInisialisasi() {
        imageView_alpukat = findViewById(R.id.imageView_alpukat)
        imageView_apel = findViewById(R.id.imageView_apel)
        imageView_ceri = findViewById(R.id.imageView_ceri)
        imageView_durian = findViewById(R.id.imageView_durian)
    }
}
