package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee2Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee3Binding;

public class megaLightCoffee3Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee3Binding binding = ActivityMegaLightCoffee3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee3Activity.this, megaLightCoffee4Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}