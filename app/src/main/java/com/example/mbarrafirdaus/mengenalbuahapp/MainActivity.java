package com.example.mbarrafirdaus.mengenalbuahapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tebak_gambar(View view) {
        Toast.makeText(MainActivity.this, "Aplikasi Mengenal Buah", Toast.LENGTH_LONG).show();
    }

    public void bt_apple(View view) {
        Intent Apple = new Intent(MainActivity.this, Apple.class);
        startActivity(Apple);

    }

    public void bt_watermelon(View view) {
        Intent Watermelon = new Intent(MainActivity.this, Watermelon.class);
        startActivity(Watermelon);
    }

    public void bt_grape(View view) {
        Intent Grape = new Intent(MainActivity.this, Grape.class);
        startActivity(Grape);
    }

    public void bt_orange(View view) {
        Intent Orange = new Intent(MainActivity.this, Orange.class);
        startActivity(Orange);
    }

}

