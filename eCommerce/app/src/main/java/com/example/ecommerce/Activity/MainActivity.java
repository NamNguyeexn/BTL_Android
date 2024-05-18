package com.example.ecommerce.Activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ecommerce.Adapter.PopularAdapter;
import com.example.ecommerce.Model.Popular;
import com.example.ecommerce.R;
import com.example.ecommerce.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initRecycleView();
    }

    private void initRecycleView() {
        ArrayList<Popular> items = new ArrayList<>();
        items.add(new Popular("Beauty", "img_product1",15,4,500,"test beauty"));
        items.add(new Popular("Iphone", "img_product2",10,4.5,450,"test phone"));
        items.add(new Popular("Smart Watch", "img_product3",3,4.9,800,"test watch"));
        binding.popularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        binding.popularView.setAdapter(new PopularAdapter(items));
    }
}