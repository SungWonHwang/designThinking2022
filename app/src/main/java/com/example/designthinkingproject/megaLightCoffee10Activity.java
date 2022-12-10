package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee10Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee8Binding;

public class megaLightCoffee10Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee10Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee10Binding binding = ActivityMegaLightCoffee10Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee10Activity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}