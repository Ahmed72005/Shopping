package com.example.ahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class M2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);
    }

    public void m3(View view) {
        Intent intent = new Intent(M2.this, M3.class);
        startActivity(intent);
    }

    public void m1(View view) {
        Intent intent = new Intent(M2.this, m1.class);
        startActivity(intent);
    }
}