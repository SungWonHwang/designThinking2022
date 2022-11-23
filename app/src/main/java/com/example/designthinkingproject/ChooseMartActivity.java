package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseCafeBinding;
import com.example.designthinkingproject.databinding.ActivityChooseMartBinding;

public class ChooseMartActivity extends MyBaseActivity {

    private ActivityChooseMartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseMartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //btnDaiso 연결 버튼
        binding.btnDaiso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseMartActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnLotteMart 연결 버튼
        binding.btnLotteMart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseMartActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}