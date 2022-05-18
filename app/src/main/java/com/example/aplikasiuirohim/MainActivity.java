package com.example.aplikasiuirohim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView cvAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //INTENT UNTUK TOMBOL BOOK
        cvAdd = (CardView) findViewById(R.id.cardbook);
        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(), intent_book.class);
                startActivity(p);
            }
        });
        //INTENT UNTUK TOMBOL SETTING
        cvAdd = (CardView) findViewById(R.id.cardSetting);
        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(getApplicationContext(), intent_setting.class);
                startActivity(p);
            }
        });
    }
}