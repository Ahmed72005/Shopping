package com.example.ahmed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void mycart(View view) {
        Intent intent = new Intent(Order.this, Mycart.class);
        startActivity(intent);
    }

    public void Puycard(View view) {
        Intent intent = new Intent(Order.this, Puycard.class);
        startActivity(intent);
    }
}
