package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityChooseMartBinding;
import com.example.designthinkingproject.databinding.ActivityChooseMovieBinding;

public class ChooseMovieActivity extends AppCompatActivity {

    private ActivityChooseMovieBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseMovieBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //btnDaiso 연결 버튼
        binding.btnCGV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseMovieActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnLotteMart 연결 버튼
        binding.btnMegaBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseMovieActivity.this, ChooseFuncActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}