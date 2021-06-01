package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declare all the views here
    EditText name,number,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize all the views here
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        link = findViewById(R.id.email);
    }

    public void next(View view) {
        //Here we will work with the explicit intent
        String n = name.getText().toString();
        //Intent obj = new Intent(Present class,next class)
        //startActivity(obj)
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);

    }

    public void search(View view) {
        String n = link.getText().toString();
        Uri uri = Uri.parse("https://"+n);
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }

    public void dial(View view) {
        //Here we work with Implicit Intent
        String n = number.getText().toString();
        //Uri - Unified Resource Identifier
        //phone - tel:,we - https:// ,loc - geo:lat,lon
        Uri uri = Uri.parse("tel:"+n);
        Intent i = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }
}