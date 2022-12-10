package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee5Binding;

public class megaLightCoffee5Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee5Binding binding = ActivityMegaLightCoffee5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee5Activity.this, megaLightCoffee6Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}