package com.example.feedd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button donate = findViewById(R.id.donate);
        donate.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this,DonateActivity.class);
            startActivity(intent);
        });

        Button recieve = findViewById(R.id.recieve);
        recieve.setOnClickListener(view -> {
            Intent intent = new Intent(SecondActivity.this,RecieveActivity.class);
            startActivity(intent);
        });
    }
}