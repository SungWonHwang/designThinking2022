package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee2Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee4Binding;

public class megaLightCoffee4Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee4Binding binding = ActivityMegaLightCoffee4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee4Activity.this, megaLightCoffee5Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}