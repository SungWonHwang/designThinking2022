package com.example.designthinkingproject.megaFollowBeverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.designthinkingproject.databinding.ActivityMegaFollowBeverage2Binding;

public class megaFollowBeverage2Activity extends AppCompatActivity {
    private ActivityMegaFollowBeverage2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowBeverage2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 고구마라떼 연결 버튼
        binding.btnMega2SweetPotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverage2Activity.this, megaFollowBeverageA15Sweetpotato.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}