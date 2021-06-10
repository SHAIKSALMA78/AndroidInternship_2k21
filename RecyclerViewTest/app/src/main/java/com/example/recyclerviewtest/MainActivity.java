package com.example.recyclerviewtest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ItemAdapter.MyInterface {
    RecyclerView rv;
    int totalAmount=0;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);
        button=findViewById(R.id.button);
        int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j};
        String[] itemNames = {"Chicken Biryani","Chicken Lollipop",
                "Egg Fried Rice","Chicken65","Mutton Curry","Mutton Biryani",
                "Fish Curry","prawns Curry","Veg Noodles","Chicken Noodles"};
        String[] itemPrices = {"200","250","150","300","400",
                "350","400","250","100","150"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(this,images,itemNames,itemPrices,this);
        rv.setAdapter(adapter);

    }

    public void submit(View view) {
    }

    @Override
    public void selectedItems(String itemName, String itemPrice, int position, int totalPrice) {
        Toast.makeText(this, " "+totalPrice, Toast.LENGTH_SHORT).show();
        Log.i("TOTAL"," "+totalPrice);
        totalAmount=totalAmount+Integer.parseInt(itemPrice);
        button.setText(String.valueOf(totalAmount));

    }
}