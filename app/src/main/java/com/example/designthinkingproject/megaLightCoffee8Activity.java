package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee7Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee8Binding;

public class megaLightCoffee8Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee8Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee8Binding binding = ActivityMegaLightCoffee8Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee8Activity.this, megaLightCoffee9Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}