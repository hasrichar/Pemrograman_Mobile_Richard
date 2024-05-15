package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView_apel;
    private ImageView imageView_durian;
    private ImageView imageView_ceri;
    private ImageView imageView_alpukat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInisialisasi();
        onClickMantab();
    }

    private void onClickMantab() {
        imageView_durian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MainActivity.this, TebakActivity.class);
                d.putExtra("nama_buah", "durian");
                startActivity(d);
            }
        });
        imageView_ceri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, TebakActivity.class);
                c.putExtra("nama_buah", "ceri");
                startActivity(c);
            }
        });
        imageView_apel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, TebakActivity.class);
                a.putExtra("nama_buah", "apel");
                startActivity(a);
            }
        });
        imageView_alpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent al = new Intent(MainActivity.this, TebakActivity.class);
                al.putExtra("nama_buah", "alpukat");
                startActivity(al);
            }
        });
    }

    private void setInisialisasi() {
        imageView_alpukat = findViewById(R.id.imageView_alpukat);
        imageView_apel = findViewById(R.id.imageView_apel);
        imageView_ceri = findViewById(R.id.imageView_ceri);
        imageView_durian = findViewById(R.id.imageView_durian);
    }
}

