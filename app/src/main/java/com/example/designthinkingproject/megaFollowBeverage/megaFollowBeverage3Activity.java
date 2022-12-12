package com.example.designthinkingproject.megaFollowBeverage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowBeverage3Binding;


public class megaFollowBeverage3Activity extends AppCompatActivity {

    private ActivityMegaFollowBeverage3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowBeverage3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega5 탄산있는 연결 버튼
        binding.btnMega3CarbonicAcid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverage3Activity.this, megaFollowBeverage4Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega5 우유있는 연결 버튼
        binding.btnMega3Milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowBeverage3Activity.this, megaFollowBeverage6Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}