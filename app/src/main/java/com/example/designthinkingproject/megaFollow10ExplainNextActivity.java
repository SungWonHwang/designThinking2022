package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollow10ExplainNextBinding;
import com.example.designthinkingproject.databinding.ActivityMegaFollow9SelectionEndBinding;

public class megaFollow10ExplainNextActivity extends AppCompatActivity {

    private ActivityMegaFollow10ExplainNextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow10ExplainNextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnNextPage 연결 버튼
        binding.btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(megaFollow10ExplainNextActivity.this, megaLightCoffee1Activity.class);
                    startActivity(intent); //액티비티 이동
            }
        });


    }
}