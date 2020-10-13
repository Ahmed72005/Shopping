package com.example.ahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class m1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
    }

    public void m2(View view) {
        Intent intent = new Intent(m1.this, M2.class);
        startActivity(intent);
    }

    public void m3(View view) {
        Intent intent = new Intent(m1.this, M3.class);
        startActivity(intent);
    }
}