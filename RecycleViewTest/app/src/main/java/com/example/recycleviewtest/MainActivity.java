package com.example.recycleviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int [] images = {R.drawable.a,R.drawable.b,R.drawable.c,
                R.drawable.d,R.drawable.e,R.drawable.f,
                R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j};
        String[] itemNames = {"Chicken Biryani","Chicken Lollipop",
                "Egg Fried Rice","Chicken65","Mutton Curry","Mutton Biryani",
                "Fish Curry","prawns Curry","Veg Noodles","Chicken Noodles"};
        String[] itemPrices = {"200","250","150","300","400",
                "350","400","250","100","150"};
        rv = findViewById(R.id.recyclerview);

    }
}