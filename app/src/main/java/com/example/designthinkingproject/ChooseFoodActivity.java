package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseCafeBinding;
import com.example.designthinkingproject.databinding.ActivityChooseFoodBinding;

public class ChooseFoodActivity extends MyBaseActivity {

    private ActivityChooseFoodBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //btnMacdonald 연결 버튼
        binding.btnMacdonald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseFoodActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnKFC 연결 버튼
        binding.btnKFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseFoodActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}