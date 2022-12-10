package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollow7placeBinding;
import com.example.designthinkingproject.databinding.ActivityMegaFollow8qrBinding;

public class megaFollow8QrActivity extends AppCompatActivity {

    private ActivityMegaFollow8qrBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow8qrBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnGoToHome 연결 버튼
        binding.btnGoToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollow8QrActivity.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });


    }
}