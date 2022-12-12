package com.example.designthinkingproject.megaFollowBeverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.designthinkingproject.databinding.ActivityMegaFollowBeverage6Binding;

public class megaFollowBeverage6Activity extends AppCompatActivity {
    private ActivityMegaFollowBeverage6Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowBeverage6Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 고구마라떼 연결 버튼
        binding.btnMega6SweetPotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverage6Activity.this, megaFollowBeverageA15Sweetpotato.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }
}