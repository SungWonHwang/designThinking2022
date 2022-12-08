package com.example.designthinkingproject.megaFollowCoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designthinkingproject.databinding.ActivityMegaFollowCoffee4Binding;

public class megaFollowCoffee4Activity extends AppCompatActivity {

    private ActivityMegaFollowCoffee4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMegaFollowCoffee4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // 2

        //btnMega4MilkTrue 연결 버튼
        binding.btnMega4MilkTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee4Activity.this, megaFollowCoffee5Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //btnMega4MilkFalse 연결 버튼
        binding.btnMega4MilkFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(megaFollowCoffee4Activity.this, megaFollowCoffee5Activity.class);
                startActivity(intent); //액티비티 이동
            }
        });



    }
}