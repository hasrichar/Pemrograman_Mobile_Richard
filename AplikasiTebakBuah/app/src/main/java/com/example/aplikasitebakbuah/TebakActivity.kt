package com.example.aplikasitebakbuah

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TebakActivity : AppCompatActivity() {
    private lateinit var imageView_tebak: ImageView
    private lateinit var editText_jawabb: EditText
    private lateinit var button_cek: Button
    private var jawaban: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebak)
        setInisialisasi()
        cekIntent()
        onClickJos()
    }

    private fun onClickJos() {
        button_cek.setOnClickListener {
            if (editText_jawabb.text.toString() == jawaban) {
                Toast.makeText(this@TebakActivity, "Yee Benar!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@TebakActivity, "oo Salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun cekIntent() {
        val cek = intent
        val nama_buah = cek.getStringExtra("nama_buah")
        jawaban = when (nama_buah) {
            "alpukat" -> {
                imageView_tebak.setImageResource(R.drawable.alpukat)
                "alpukat"
            }
            "apel" -> {
                imageView_tebak.setImageResource(R.drawable.apel)
                "apel"
            }
            "durian" -> {
                imageView_tebak.setImageResource(R.drawable.durian)
                "durian"
            }
            else -> {
                imageView_tebak.setImageResource(R.drawable.ceri)
                "ceri"
            }
        }
    }

    private fun setInisialisasi() {
        imageView_tebak = findViewById(R.id.imageView_tebak)
        editText_jawabb = findViewById(R.id.editText_jawab)
        button_cek = findViewById(R.id.buttonCek)
    }
}
