package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseCafeBinding;

public class ChooseCafeActivity extends AppCompatActivity {

    private ActivityChooseCafeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseCafeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //btnCoffeeBean 연결 버튼
        binding.btnCoffeeBean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseCafeActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnHollys 연결 버튼
        binding.btnHollys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseCafeActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}