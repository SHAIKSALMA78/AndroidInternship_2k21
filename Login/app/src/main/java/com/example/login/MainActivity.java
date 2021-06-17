package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.SharedPreferences;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;

import com.example.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        sp=getSharedPreferences("ap",MODE_PRIVATE);
    }


    public void login(View view) {
    }

    public void register(View view) {
    }
}