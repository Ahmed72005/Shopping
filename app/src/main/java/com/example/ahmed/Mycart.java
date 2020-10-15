package com.example.ahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mycart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycart);
    }

    public void m2(View view) {
        Intent intent = new Intent(Mycart.this, M2.class);
        startActivity(intent);
    }

    public void M4(View view) {
        Intent intent = new Intent(Mycart.this, M4.class);
        startActivity(intent);
    }

    public void Puycard(View view) {
        Intent intent = new Intent(Mycart.this, Puycard.class);
        startActivity(intent);
    }
}