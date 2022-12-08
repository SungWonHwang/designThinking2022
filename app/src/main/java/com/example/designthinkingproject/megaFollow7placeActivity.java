package com.example.designthinkingproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollow7placeBinding;

public class megaFollow7placeActivity extends MyBaseActivity {

    private ActivityMegaFollow7placeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow7placeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega7Here 연결 버튼
        binding.btnMega7Here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollow7placeActivity.this, megaFollow8QrActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega7Togo 연결 버튼
        binding.btnMega7Togo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollow7placeActivity.this, megaFollow8QrActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });


    }
}