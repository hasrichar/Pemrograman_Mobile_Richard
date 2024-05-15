package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TebakActivity extends AppCompatActivity {

    private ImageView imageView_tebak;
    private EditText editText_jawabb;
    private Button button_cek;
    private String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);
        setInisialisasi();
        cekIntent();
        onClickJos();
    }

    private void onClickJos() {
        button_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText_jawabb.getText().toString().equals(jawaban)) {
                    Toast.makeText(TebakActivity.this, "Yee Benar!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TebakActivity.this, "oo Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void cekIntent() {
        Intent cek = getIntent();
        String nama_buah = cek.getStringExtra("nama_buah");
        switch (nama_buah) {
            case "alpukat":
                imageView_tebak.setImageResource(R.drawable.alpukat);
                jawaban = "alpukat";
                break;
            case "apel":
                imageView_tebak.setImageResource(R.drawable.apel);
                jawaban = "apel";
                break;
            case "durian":
                imageView_tebak.setImageResource(R.drawable.durian);
                jawaban = "durian";
                break;
            default:
                imageView_tebak.setImageResource(R.drawable.ceri);
                jawaban = "ceri";
                break;
        }
    }

    private void setInisialisasi() {
        imageView_tebak = findViewById(R.id.imageView_tebak);
        editText_jawabb = findViewById(R.id.editText_jawab);
        button_cek = findViewById(R.id.buttonCek);
    }
}
