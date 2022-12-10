package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee5Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee6Binding;

public class megaLightCoffee6Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee6Binding binding = ActivityMegaLightCoffee6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee6Activity.this, megaLightCoffee7Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}