package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee10Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee8Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee9Binding;

public class megaLightCoffee9Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee9Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee9Binding binding = ActivityMegaLightCoffee9Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega12 연결 버튼
        binding.btnMega12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee9Activity.this, megaLightCoffee10Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}