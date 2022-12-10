package com.example.designthinkingproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee1Binding;
import com.example.designthinkingproject.databinding.ActivityMegaLightCoffee2Binding;

public class megaLightCoffee2Activity extends AppCompatActivity {

    private ActivityMegaLightCoffee2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @NonNull ActivityMegaLightCoffee2Binding binding = ActivityMegaLightCoffee2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega3 연결 버튼
        binding.btnMega3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaLightCoffee2Activity.this, megaLightCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }

}