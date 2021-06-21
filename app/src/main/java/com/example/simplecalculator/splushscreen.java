package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splushscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splushscreen);

        new Handler().postDelayed(new Runnable() {



            @Override

            public void run() {

                Intent i = new Intent(splushscreen.this, MainActivity.class);

                startActivity(i);



                finish();

            }

        }, 2*1000);
    }
}