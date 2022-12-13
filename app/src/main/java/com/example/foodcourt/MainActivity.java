package com.example.foodcourt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodcourt.Adapter.MainAdapter;
import com.example.foodcourt.Model.MainModel;
import com.example.foodcourt.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.burger2 , "Burger", "5", "Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.chicken , "Chicken", "10", "Whole chicken, buttermilk, egg, cayenne pepper, baking powder"));
        list.add(new MainModel(R.drawable.pizza , "Pizza", "20", "Bread flour, olive oil, active dry yeast, white sugar"));
        list.add(new MainModel(R.drawable.sushi2 , "Sushi", "50", "Smoked salmon, sushi rice, soy sauce, wasabi, rice wine"));
        list.add(new MainModel(R.drawable.burger2 , "Burger", "15", "Chicken burger with extra cheese"));

        MainAdapter adapter = new MainAdapter(list, this );

        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }
}