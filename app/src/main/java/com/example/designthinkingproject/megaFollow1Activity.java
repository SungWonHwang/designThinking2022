package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollow1Binding;

public class megaFollow1Activity extends AppCompatActivity {
    private ActivityMegaFollow1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMegaCoffee 연결 버튼
        binding.btnMegaCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollow1Activity.this, megaFollowCoffee2Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //세은님 작업 공간. 버튼 연결
    }
}

