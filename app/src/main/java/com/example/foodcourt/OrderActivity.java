package com.example.foodcourt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodcourt.Adapter.OrdersAdapter;
import com.example.foodcourt.Model.OrderModel;
import com.example.foodcourt.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel(R.drawable.burger2, "Burger" , "5", "30454684"));
        list.add(new OrderModel(R.drawable.chicken, "Chicken" , "10", "40454684"));
        list.add(new OrderModel(R.drawable.pizza, "Pizza" , "15", "50454684"));
        list.add(new OrderModel(R.drawable.sushi2, "Sushi" , "50", "60454684"));
        list.add(new OrderModel(R.drawable.burger2, "Burger" , "15", "70454684"));



        OrdersAdapter adapter;
        adapter = new OrdersAdapter(list , this);
        binding.orderrecylerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderrecylerview.setLayoutManager(layoutManager);

    }
}