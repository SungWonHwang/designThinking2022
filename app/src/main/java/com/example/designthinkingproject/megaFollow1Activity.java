package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

import com.example.designthinkingproject.databinding.ActivityMegaFollow1Binding;
import com.example.designthinkingproject.megaFollowCoffee.megaFollowCoffee3Activity;
import com.example.designthinkingproject.megaFollowSnack.megaFollowSnack2;

public class megaFollow1Activity extends AppCompatActivity {
    private ActivityMegaFollow1Binding binding;

    @SuppressLint("StaticFieldLeak")
    public static Context BigMenu; // context 변수 선언
    public int var; // 다른 Activity에서 접근할 변수     1: Coffee, 2: Tea, 3: Beverage


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollow1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2
        BigMenu = this; // onCreate에서 this 할당

        //btnMegaCoffee 연결 버튼
        binding.btnMegaCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var =1;
                Intent intent = new Intent(megaFollow1Activity.this, megaFollowCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMegaTea 연결 버튼
        binding.btnMegaTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var = 2;
                Intent intent = new Intent(megaFollow1Activity.this, megaFollowCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMegaBeverage 연결 버튼
        binding.btnMegaDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var = 3;
                Intent intent = new Intent(megaFollow1Activity.this, megaFollowCoffee3Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMegaSnack 연결 버튼
        binding.btnMegaFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollow1Activity.this, megaFollowSnack2.class);
                startActivity(intent); //액티비티 이동
            }
        });
    }

}

