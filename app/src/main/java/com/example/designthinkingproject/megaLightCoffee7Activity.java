package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee6Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee7Binding;

public class megaLightCoffee7Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee7Binding binding = ActivityMegaLightCoffee7Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee7Activity.this, megaLightCoffee8Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}