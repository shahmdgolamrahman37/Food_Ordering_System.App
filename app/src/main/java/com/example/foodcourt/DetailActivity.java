package com.example.foodcourt;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.foodcourt.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image = getIntent().getIntExtra("image", 0);
        int price = Integer.parseInt(getIntent().getStringExtra("price"));
        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("desc");

        binding.detailimage.setImageResource(image);
        binding.pricelbl.setText(String.format("%d", price));
        binding.nameBox.setText(name);
        binding.deailDescription.setText(description);



    }
}