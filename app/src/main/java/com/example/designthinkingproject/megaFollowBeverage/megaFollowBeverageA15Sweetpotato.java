package com.example.designthinkingproject.megaFollowBeverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.designthinkingproject.databinding.ActivityMegaFollowBeverageA15SweetpotatoBinding;
import com.example.designthinkingproject.megaFollow6ExtralorderActivity;

public class megaFollowBeverageA15Sweetpotato extends AppCompatActivity {

    private ActivityMegaFollowBeverageA15SweetpotatoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMegaFollowBeverageA15SweetpotatoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 탄산있는 연결 버튼
        binding.SweetPotatoeIntrod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverageA15Sweetpotato.this, megaFollow6ExtralorderActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}